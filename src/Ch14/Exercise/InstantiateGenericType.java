package Ch14.Exercise;

import static net.mindview.util.Print.print;

class ClassAsFactory <T> {
    private T tt;

    public ClassAsFactory (Class <T> type) {
        try {
            tt = type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}

public class InstantiateGenericType {

    public static void main(String[] args) {
        ClassAsFactory <Employee> f1 = new ClassAsFactory<>(Employee.class);
        print("ClassAsFactory<Employee> succeeded");

        try {
            ClassAsFactory<Integer> f2 =
                    new ClassAsFactory<Integer>(Integer.class);
        } catch(Exception e) {
            print("ClassAsFactory<Integer> failed");
        }
    }

}
