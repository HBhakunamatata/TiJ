package Ch09.Exercises;

import Ch08.Exercise.exercise04.DerivedClass;

public class Parcel3 {
    class Content {
        private int value = 11;
        public int getValue() {
            return value;
        }
    }

    class Destination {
        private String labal;
        Destination(String dest) {
            labal = dest;
        }
        public String readLabel(){
            return labal;
        }
    }

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Parcel3.Content content = p.new Content();
        Parcel3.Destination dest = p.new Destination("China");
    }
}
