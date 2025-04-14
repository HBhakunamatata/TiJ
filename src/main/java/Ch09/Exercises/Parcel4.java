package Ch09.Exercises;

import sun.security.krb5.internal.crypto.Des;

public class Parcel4 {
    // Content ignore

    private class PDestination implements Destination {

        private String label;

        PDestination(String dest){
            label = dest;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String dest){
        return new PDestination(dest);
    }

    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        Destination dest = parcel4.destination("Toronto");
        System.out.println(dest.readLabel());
    }
}
