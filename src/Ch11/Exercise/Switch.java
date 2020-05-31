package Ch11.Exercise;

import static net.mindview.util.Print.*;

public class Switch {
    private static boolean state = false;
    public void on() {
        state = true;
        print(this);
    }
    public void off() {
        state = false;
        print(this);
    }

    @Override
    public String toString() {
        return "State : " + (state? "on" : "off");
    }

    public boolean read() {
        return state;
    }
}
