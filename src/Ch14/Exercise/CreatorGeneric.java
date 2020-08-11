package Ch14.Exercise;

import javax.swing.event.CellEditorListener;

abstract class GenericWithCreate <T> {
    final T element;
    public GenericWithCreate () {
        element = create();
    }

    abstract T create();
}

class X {}

class Creator extends GenericWithCreate <X> {

    @Override
    X create() {
        return new X();
    }

    public void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}

public class CreatorGeneric {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.f();
    }
}
