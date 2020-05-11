package Ch09.Exercises;

// Nesting a class within a method.

public class Parcel5 {

    public Destination destination(String dest) {
        class PDestination implements Destination {
            String label;

            PDestination(String dest){
                label = dest;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestination(dest);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination dest = parcel5.destination("Toronto");
        System.out.println(dest.readLabel());
    }


}
