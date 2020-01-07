package Ch07;


class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}
class Wheal extends Grain {
    @Override
    public String toString() {
        return "Wheal";
    }
}

class Mill{
    public Grain process() {
        return new Grain();
    }
}

class WheelMill extends Mill {
    @Override
    public Wheal process() {
        return new Wheal();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);

        m = new WheelMill();
        g = m.process();
        System.out.println(g);
    }
}
