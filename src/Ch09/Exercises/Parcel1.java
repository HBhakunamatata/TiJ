/*
 * use a inner class just like using any other classes
 */

package Ch09.Exercises;

public class Parcel1 {
    class Content {
        private int value = 11;
        public int value () {
            return value;
        }
    }
    class Destination {
        private String label;
        Destination (String whereTo) {
            label = whereTo;
        }
        public String readLabel () {
            return label;
        }
    }

    public void ship(String dest) {
        Content content = new Content();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("China");
    }
}
