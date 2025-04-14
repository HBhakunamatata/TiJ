package Ch17.Exercise;

/*
 * Modify Exercise 7 so that the name of the file you read
 * is provided as a command-line argument.
 */

import java.io.IOException;

public class Exercise08 {
    public static void main(String[] args) throws IOException {
        if (args.length == 0)
            Exercise07.readReverce("./src/Ch17/Exercise/Exercise07");
        else
            Exercise07.readReverce(args[0]);
    }
}
