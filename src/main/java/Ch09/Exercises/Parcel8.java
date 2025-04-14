package Ch09.Exercises;



public class Parcel8 {

    public Wrapping wrapping(int arg) {
        return new Wrapping(arg){  // Pass constructor argument.
            @Override
            public int getValue() {
                return super.getValue() + arg;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel = new Parcel8();
        Wrapping wrapping = parcel.wrapping(22);
        System.out.println("Now value = " + wrapping.getValue());
    }
}
