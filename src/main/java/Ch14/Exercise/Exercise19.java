package Ch14.Exercise;

/*
* Following the form of Store.java,
* build a model of a containerized cargo ship.
*
 */


import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Goods {
    private int id;
    private String order;
    private int quantity;

    public Goods(int id, String order, int quantity) {
        this.id = id;
        this.order = order;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "No." + id + " : " + quantity + ", order info: " + order;
    }

    public static Generator<Goods> generator() {
        return new Generator<Goods>() {
            Random random = new Random();
            @Override
            public Goods next() {
                return new Goods(
                        random.nextInt(200),
                        "A kind of Goods",
                        random.nextInt(500)
                );
            }
        };
    }
}

class Docker extends ArrayList<Goods> {
    public Docker (int nGoods) {
        Generators.fill(this, Goods.generator(), nGoods);
    }
}

class CargoHold extends ArrayList <Docker> {
    public CargoHold (int nDocker, int nGoods) {
        for (int i = 0; i < nDocker; i++) {
            this.add(new Docker(nGoods));
        }
    }
}

class CargoShip extends ArrayList <CargoHold> {
    public CargoShip (int nCargoHold, int nDocker, int nGoods) {
        for (int i = 0; i < nCargoHold; i++) {
            this.add(new CargoHold(nDocker, nGoods));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (CargoHold cargohold : this) {
            for (Docker docker : cargohold) {
                for (Goods goods : docker) {
                    builder.append(goods);
                    builder.append("\n");
                }
            }
        }
        return builder.toString();
    }
}


public class Exercise19 {

    public static void main(String[] args) {
        CargoShip ship = new CargoShip(5, 3, 20);
        System.out.println(ship);
    }
}
