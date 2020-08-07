package Ch14.Exercise;

/*
 * Use RandomList with two more types in addition to the one shown in main().
 */

public class Exercise06 {
    public static void main(String[] args) {
        RandomList <Integer> integerRandomList = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            integerRandomList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(integerRandomList.select() + " ");
        }
    }
}
