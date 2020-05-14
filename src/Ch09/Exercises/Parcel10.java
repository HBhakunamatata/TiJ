package Ch09.Exercises;

/*
 * Using "instance initialization" to perform
 * construction on an anonymous inner class.
 */

import sun.security.krb5.internal.crypto.Des;

public class Parcel10 {

    public Destination
    destination( final String dest, final float price){
        return new Destination() {
            private int cost;
            // Instance initialization for each object: 
            {
                cost = Math.round(price);
                if(cost >= 100){
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel = new Parcel10();
        Destination dest = parcel.destination("Toronto", 101.11F);
    }
}
