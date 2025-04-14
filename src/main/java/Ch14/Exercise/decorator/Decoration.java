package Ch14.Exercise.decorator;

import com.sun.javafx.stage.StagePeerListener;

import java.util.*;


class Basic {
    private String value;
    public String getValue () {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}

class Decorator extends Basic {
    protected Basic basic;
    public Decorator(Basic basic) {
        this.basic = basic;
    }

    @Override
    public String getValue() {
        return basic.getValue();
    }

    @Override
    public void setValue(String value) {
        basic.setValue(value);
    }
}

class Stamped extends Decorator {
    private long stamped;

    public Stamped (Basic basic) {
        super(basic);
    }

    public long getStamped () {
        return new Date().getTime();
    }

    public void setStamped (long stamped) {
        this.stamped = stamped;
    }
}

class SerialNumbered extends Decorator {
    private long serialNumber;

    public SerialNumbered (Basic basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }
}

public class Decoration {

    public static void main(String[] args) {
        Stamped st1 = new Stamped(new Basic());
        st1.getStamped();
        Stamped st2 = new Stamped(new SerialNumbered(new Basic()));
        st2.getValue();
        //st2.getSerialNumbered();

        SerialNumbered s = new SerialNumbered(new Basic());
        SerialNumbered s2 = new SerialNumbered(
            new Stamped(new Basic()));
        //- s2.getStamp(); // Not available
    }
}
