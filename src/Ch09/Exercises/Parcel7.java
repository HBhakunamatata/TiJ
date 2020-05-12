package Ch09.Exercises;

public class Parcel7 {
    public Content content(){
        return new Content() {   // Insert a class definition
            private int value = 11;
            @Override
            public int getValue() {
                return value;
            }
        };  // Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel7 parcel = new Parcel7();
        Content c = parcel.content();
        System.out.println(c.getValue());
    }
}
