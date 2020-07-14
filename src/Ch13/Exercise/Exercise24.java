package Ch13.Exercise;

// Add Null Objects to RegisteredFactories.java.

import net.mindview.util.Null;

class NullPart extends Part implements Null {
    public static class Factory
            implements Ch13.Exercise.factory.Factory<Part> {
        public Part create() { return new NullPart(); }
    }
}

public class Exercise24 {
    public static void main(String[] args) {
        new NullPart();
    }
}
