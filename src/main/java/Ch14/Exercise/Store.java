package Ch14.Exercise;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Product {
    // private static int counter = 0;
    private final int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public void changePrice(double change) {
        price = price + change;
    }

    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

    public static Generator <Product> generator() {
        return new Generator<Product>() {
            Random random = new Random();
            @Override
            public Product next() {
                return new Product(
                        random.nextInt(1000),
                        "Test",
                        Math.round(random.nextDouble() * 1000) + 0.99
                );
            }
        };
    }
}

class Shelf extends ArrayList <Product> {
    public Shelf (int nProduct) {
        Generators.fill(this, Product.generator(), nProduct);
    }
}

class Aisle extends ArrayList <Shelf> {
    public Aisle (int nShelves, int nProduct) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProduct));
        }
    }
}

class CheckoutStand {}

class Office {}

public class Store extends ArrayList <Aisle> {

    private CheckoutStand checkoutStand = new CheckoutStand();
    private Office office = new Office();

    public Store (int nAisles, int nShelves, int nProducts) {
        for (int i = 0; i < nAisles; i++) {
            this.add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Aisle aisle : this) {
            for (Shelf s : aisle) {
                for (Product p : s) {
                    builder.append(p);
                    builder.append("\n");
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Store store = new Store(5, 4, 20);
        System.out.println(store);
    }
}
