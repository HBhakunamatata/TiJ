package Ch09.Exercises;

public class Parcel7b {
    private class MyContents implements Content {
        private int value = 11;
        @Override
        public int getValue() {
            return value;
        }
    }

    public Content content(){
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b parcel = new Parcel7b();
        Content c = parcel.content();
        System.out.println("value = " + c.getValue());
    }
}
