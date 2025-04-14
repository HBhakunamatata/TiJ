package Ch12.Exercise;

public class SimpleFormat {
    public static void main(String[] args) {
        int i = 1;
        double d = 1.2;
        // The old way
        System.out.println("i = " + i + ", d = " + d);
        // The new way : equivalent
        System.out.printf("i = %d, d = %f", i, d);
        System.out.format("i = %d, d = %f", i, d);
    }
}
