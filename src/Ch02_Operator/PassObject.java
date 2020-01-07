package Ch02_Operator;

/*
 * The issue of aliasing when calling methods
 * may be a big trouble.
 */

import static net.mindview.util.Print.*;

class Letter {
    char c;
}

public class PassObject {
    static void f (Letter letter){
        letter.c = 'z';
    }
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        print("1: letter.c : " + letter.c);
        f(letter);
        print("2: letter.c : " + letter.c);

    }
}

/*
 * J is passed by value.
 * when method receive an object, we send a copy of reference
 * and the origin object just stand alone
 * In the scope of method, we can manu the object using the copy reference
 * but we can not change the pointer sticking into
 * because it is a copy not the origin.
 */
