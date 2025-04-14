package Ch13.Exercise;

/*
  In ToyTest.java, comment out Toy’s default constructor and explain what happens.
 */

class Toy1 {
    // There is no default constructor
    Toy1(int i) {}
}

public class Exercise01 {
    public static void main(String[] args) {
        Object obj = null;
        try {
            Class c = Class.forName("Ch13.Exercise.Toy1");
            obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find Ch13.Exercise.Toy1");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
