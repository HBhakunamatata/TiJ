package Ch14.Exercise;

import java.util.*;

interface Stamped {
    long getStamped();
}

class  StampedImpl implements Stamped {

    @Override
    public long getStamped() {
        return new Date().getTime();
    }
}

interface SerialNumbered {
    long getSerialNumber();
}

class SerialNumberedImpl implements SerialNumbered {

    private static long counter = 0;
    private final long id = counter++;
    @Override
    public long getSerialNumber() {
        return id;
    }
}

interface Basic {
    void set (String value);
    String get();
}

class BasicImpl implements Basic {

    private String value;

    @Override
    public void set(String value) {
        this.value = value;
    }

    @Override
    public String get() {
        return null;
    }
}

class Mixin extends BasicImpl implements Stamped, SerialNumbered{

    private Stamped stamped = new StampedImpl();
    private SerialNumbered serial = new SerialNumberedImpl();

    @Override
    public long getStamped() {
        return stamped.getStamped();
    }

    @Override
    public long getSerialNumber() {
        return serial.getSerialNumber();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " +
        mixin1.getStamped() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " +
        mixin2.getStamped() + " " + mixin2.getSerialNumber());
    }
}
