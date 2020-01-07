package Ch04;

class A {
}

public class NewVarArgs {

    static void show (Object ... args) {
        for (Object i : args
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        show(14, 3.14F, 11.11);
        show(new Integer(14), new Float(3.14), new Double(11.11));
        show("one", "two", "three");
        // Or an array:
        show((Object[])new Integer[]{ 1, 2, 3, 4 }); // avoid a compiler _warning_
        show(); // Empty list is OK
    }
}
