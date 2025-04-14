package Ch07.shape;

import java.util.Random;

public class ShapeGenerator {
    private Random rand = new Random();
    public Shape generate(){
        switch (rand.nextInt(3)) {
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
        return null;
    }
}
