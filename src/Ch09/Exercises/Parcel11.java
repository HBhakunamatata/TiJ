package Ch09.Exercises;

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
}
