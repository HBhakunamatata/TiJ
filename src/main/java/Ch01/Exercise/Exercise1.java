package Ch01.Exercise;

/*
 *  Exercise 1 :
 *  Create a class containing an int and a char that are not initialized,
 *  and print their values to verify that Java performs default initialization.
 */

public class Exercise1 {
    int anInt;
    char aChar;

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        System.out.println("The value of default integer : " + exercise1.anInt);
        System.out.println("The value of default char : " + (exercise1.aChar == '\u0000'));
        // '\u0000' 代表 字符为空 ，当char转化为包装类Character时就变成了 null
    }
}
