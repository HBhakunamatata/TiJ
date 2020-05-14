package Ch09.Exercises;

public class Parcel9 {
    public Destination destination(final String toWhere){

        // toWhere = "123";   // Then toWhere is not effectively final

        return new Destination() {
            private String label = toWhere;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel = new Parcel9();
        Destination dest = parcel.destination("Toronto");
        System.out.println(dest.readLabel());
    }
}
