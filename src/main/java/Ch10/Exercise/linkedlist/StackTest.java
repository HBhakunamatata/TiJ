package Ch10.Exercise.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 15:28
 */

public class StackTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
