package Ch13.Exercise;

/*
  Write a program to determine whether an array
    of char is a primitive type or a true Object.
 */

import java.lang.reflect.Array;

public class Exercise10 {


    public static void main(String[] args) {

        // Second way
        final Object charArray = Array.newInstance(Character.TYPE, 5);
        System.out.println(charArray.getClass().getComponentType());

        // First way
        char [] chars = new char[2];
        try {
            Class cc = chars.getClass();
            System.out.println(cc.getSimpleName());
            System.out.println(cc.getSuperclass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // https://stackoverflow.com/questions/4146928/in-java-is-a-char-an-object
}
