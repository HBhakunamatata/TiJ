package Ch12.Exercise;

import java.util.Scanner;

public class BetterRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(SimpleRead.input);
        System.out.println("What is your name?");
        String name = scanner.nextLine();  // different from next()  Note: "\n" and " "
        System.out.println(name);

        System.out.println(
                "How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = scanner.nextInt();
        double favorite = scanner.nextDouble();

        // Display
        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("Your favorite double is %f.", favorite / 2);
    }
}
