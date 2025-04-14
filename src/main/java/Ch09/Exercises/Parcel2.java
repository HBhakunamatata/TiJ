package Ch09.Exercises;

// Return the reference of inner classes

public class Parcel2 {
    class Destination {
        private String label;
        Destination(String dest) {
            label = dest;
        }
        public String readLabel() {
            return label;
        }
    }

    class Content {
        private int value = 11;
        public int getValue(){
            return value;
        }
    }

    public Content content(){
        return new Content();
    }

    public Destination to(String dest){
        return new Destination(dest);
    }

    public void ship(String dest){
        Destination destination = to(dest);
        Content content = content();
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("China");

        // return the reference of inner class
        Parcel2 q = new Parcel2();
        Parcel2.Destination dest = q.to("China");
        Parcel2.Content content = q.content();
    }
}
