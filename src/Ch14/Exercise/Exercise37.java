package Ch14.Exercise;

// Add a new mixin class Colored to Mixins.java,
// mix it into Mixin, and show that it works.

interface Colored {
    String getColored();
}

class ColoredImpl implements Colored {

    @Override
    public String getColored() {
        return "red";
    }
}

class Mixins02 extends BasicImpl
    implements Colored, Stamped, SerialNumbered {

    private Colored colored = new ColoredImpl();
    private Stamped stamped = new StampedImpl();
    private SerialNumbered serial = new SerialNumberedImpl();

    @Override
    public String getColored() {
        return colored.getColored();
    }

    @Override
    public long getStamped() {
        return stamped.getStamped();
    }

    @Override
    public long getSerialNumber() {
        return serial.getSerialNumber();
    }
}

public class Exercise37 {

    public static void main(String[] args) {
        Mixins02 mixins02 = new Mixins02();
        String colored = mixins02.getColored();
        long serialNumber = mixins02.getSerialNumber();
        long stamped = mixins02.getStamped();
        String s = mixins02.get();
    }
}
