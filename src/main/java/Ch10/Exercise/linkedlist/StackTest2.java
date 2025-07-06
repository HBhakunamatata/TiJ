package Ch10.Exercise.linkedlist;


/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 15:38
 */

public class StackTest2 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has flea".split(" ")) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }

}
