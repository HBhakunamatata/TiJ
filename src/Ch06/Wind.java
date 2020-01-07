package Ch06;

// Inheritance & upcasting

class Instrument {
    public void play () {
        System.out.println("Instrument play() ... ");
    }
    static public void tune (Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {

    public void play () {
        System.out.println("Wind play() ... ");
    }

    public static void main(String[] args) {

        // Wind objects are type of Instruments
        // because they have the same interface
        Wind flute = new Wind();
        Instrument.tune(flute);     // upcasting
    }
}
