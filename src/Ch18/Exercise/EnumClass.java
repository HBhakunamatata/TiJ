package Ch18.Exercise;

import static net.mindview.util.Print.*;

enum Shrubbery { GROUND, CRAWLING, HANGING }

public class EnumClass {

    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            print(s + " s.original() " + s.ordinal());

            printnb(s.compareTo(Shrubbery.CRAWLING));
            printnb(s.equals(Shrubbery.CRAWLING));
            print(s == Shrubbery.CRAWLING);

            print(s.getDeclaringClass());
            print(s.name());

            print("==============================");
        }

        for (String s : "HANGING CRAWLING GROUND".split(" ") ) {
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            print(shrubbery);
        }
    }
}
