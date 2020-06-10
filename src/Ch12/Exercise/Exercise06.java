package Ch12.Exercise;

import Ch01.Exercise.Exercise1;

/*
  Create a class that contains int, long, float and double fields.
  Create a toString() method for this class that uses String.format(),
  and demonstrate that your class works correctly.
*/
public class Exercise06 {
    private int age;

    @Override
    public String toString() {
        return String.format("The age = %d", age);
    }

    public static void main(String[] args) {
        System.out.println(new Exercise06());
    }
}
