package Ch14.Exercise;

import java.util.*;

import com.sun.org.apache.xml.internal.dtm.ref.CustomStringPool;
import net.mindview.util.*;

class Customer {
    private static int counter = 0;
    private final int id = counter++;

    private Customer () {}

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{"+ id + '}';
    }

    public static Generator <Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static int counter = 0;
    private final int id = counter++;

    private Teller () {}

    public int id() {
        return id;
    }

    @Override
    public String toString() {
        return "Teller{" + id + '}';
    }

    public static Generator <Teller>
        generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}

public class BankTellerSimulation {

    public static void serve (Customer customer, Teller teller) {
        System.out.println(
                teller + " is serving " + customer
        );
    }

    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        Generators.fill(queue, Customer.generator(), 20);

        List <Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator, 3);

        for (Customer c : queue) {
            serve(c, tellers.get(new Random().nextInt(tellers.size())));
        }

    }
}
