package Ch14.Exercise;

import java.io.*;
import java.util.*;

public class NeedCasting {

    @SuppressWarnings("unchecked")
    static void f (String [] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0])
        );

        // Compiler warning
        List<Widget> lw1 = (List<Widget>) in.readObject();

        // No warning
        List<Widget> lw2 = List.class.cast(in.readObject());

    }
}
