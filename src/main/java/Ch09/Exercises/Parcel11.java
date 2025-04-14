package Ch09.Exercises;

// Nested classes (static inner classes).

public class Parcel11 {

    private static class ParcelContent implements Content{
        private int value = 11;
        @Override
        public int getValue() {
            return value;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String whereTo;

        ParcelDestination(String label){
            whereTo = label;
        }

        @Override
        public String readLabel() {
            return whereTo;
        }

        // Nested classes can contain other static elements:
         public static void f() {}
         static int x = 10;
         static class AnotherLevel {
         public static void f() {}
         static int x = 10;
         }
    }

    public static Destination destination(String whereTo){
        return new ParcelDestination(whereTo);
    }

    public static Content content(){
        return new ParcelContent();
    }

    public static void main(String[] args) {
        Destination dest = destination("Toronto");
        Content cont = content();
    }
}

/*
In main( ), no object of Parcel11 is necessary; instead, you use the normal syntax for
selecting a static member to call the methods that return references to Contents and
Destination.
As you’ve seen earlier in this chapter, in an ordinary (non-static) inner class, the link to the
outer-class object is achieved with a special this reference. A nested class does not have a
special this reference, which makes it analogous to a static method.

 * In other words, we do not need the obj of Parcel11 since we have static inner classes
    ( static allows us to use it without need of new obj)
 */
