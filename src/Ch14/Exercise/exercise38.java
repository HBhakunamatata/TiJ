package Ch14.Exercise;

/*
 * Create a simple Decorator system by starting with basic coffee,
 * then providing decorators of steamed milk, foam, chocolate,
 * caramel and whipped cream.
 */

class BasicCoffee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Decorator extends BasicCoffee {
    private BasicCoffee coffee;

    public Decorator (BasicCoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void setName(String name) {
        coffee.setName(name);
    }

    @Override
    public String getName() {
        return coffee.getName();
    }
}

class SteamedMilk extends Decorator {
    private boolean hasSteamMilk;

    public SteamedMilk (BasicCoffee coffee) {
        super(coffee);
        hasSteamMilk = true;
    }

    public boolean isHasSteamMilk() {
        return hasSteamMilk;
    }
}

class Foam extends Decorator {
    private boolean hasFoam;

    public Foam (BasicCoffee coffee) {
        super(coffee);
    }

    public boolean hasFoam() {
        return hasFoam;
    }
}

public class exercise38 {
    public static void main(String[] args) {
        Foam foam = new Foam(new BasicCoffee());
        foam.hasFoam();
    }

}
