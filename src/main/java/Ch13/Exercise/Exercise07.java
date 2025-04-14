package Ch13.Exercise;

/*
  Modify SweetShop.java so that each type of object creation is
    controlled by a command-line argument.
  That is, if your command line is "Java Sweetshop Candy,"
    then only the Candy object is created.
  Notice how you can control which Class objects are loaded via the commandline argument.
 */

public class Exercise07 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Ch13.Exercise." + args[0]);
            Object obj = c.newInstance();
            System.out.println(args[0] + " object is created");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
