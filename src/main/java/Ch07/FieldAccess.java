package Ch07;

import static net.mindview.util.Print.*;

class Super {
    public int field = 0;
    public int getField () {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super s = new Sub();
        print("The field = " + s.field + " , the getField() = " + s.getField());
        Sub ss = new Sub();
        print("The field = " + ss.field + " , the getField() = " + ss.getField()
                + " , the super class field = " + ss.getSuperField());
    }
}
