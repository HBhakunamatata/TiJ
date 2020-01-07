package Ch04;
/*
 *  Demonstration of both constructor
 *  and ordinary method overloading.
 */

import static net.mindview.util.Print.*;

class Tree {
    int height;
    Tree () {
        height = 0;
    }

    Tree (int height) {
        this.height = height;
    }

    void Info () {
        print("The height of tree is " + height);
    }

    void Info(String s) {
        print(s + "The height of tree is " + height);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.Info();
        tree1.Info("Overloading method : ");

        Tree tree2 = new Tree(11);
        tree2.Info();
        tree2.Info("Overloading method : ");
    }
}
