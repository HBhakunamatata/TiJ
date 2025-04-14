package Ch14.Exercise.coffee;

/*
package net.mindview.util;
public interface Generator<T> { T next(); } ///:~
 */

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator
        implements Generator <Coffee>, Iterable <Coffee> {

    private Random random = new Random();
    private int size;

    private static Class [] coffeeClass = {
            Americano.class,
            Breve.class,
            Cappuccino.class,
            Latte.class,
            Mocha.class,
    };

    public CoffeeGenerator () {}

    public CoffeeGenerator (int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) coffeeClass[random.nextInt(coffeeClass.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator{

        private int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Object next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 6; i++) {
            System.out.println(coffeeGenerator.next());
        }

        for (Coffee coffee : new CoffeeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
