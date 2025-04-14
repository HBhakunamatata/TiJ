package Ch13.Exercise;

/*
  Modify the previous exercise so that it uses Class.getDeclaredFields()
    to also display information about the fields in a class.
 */

import java.lang.reflect.Field;

public class Exercise09 {
    public static void printFields (Class cc) {
        for (Field field : cc.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }

    public static void main(String[] args) {
        try {
            printFields(Class.forName("Ch13.Exercise.SweetShop"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
