package Ch12.Exercise;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;

public class UsingStringBuilder {
    public static Random random = new Random();

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append(random.nextInt(100));
            s.append(", ");
        }
        s.delete(s.length()-2, s.length());
        return s.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder s = new UsingStringBuilder();
        System.out.println(s);
    }

}
