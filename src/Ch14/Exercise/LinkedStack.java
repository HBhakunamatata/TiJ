package Ch14.Exercise;

public class LinkedStack <T> {
    private static class Node <T> {
        T item;
        Node<T> next;

        Node() {
            item = null;
            next = null;
        }

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node <T> top = new Node <T> ();

    public void push (T item) {
        top = new Node<T>(item, top);
    }

    public T pop () {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack <String> stringStack = new LinkedStack<>();
        String s;
        for (String ss : "You are here!".split(" ") ) {
            stringStack.push(ss);
        }
        while ( (s=stringStack.pop()) != null  ) {
            System.out.println(s);
        }
    }
}


/*
  This example makes use of an end sentinel to determine when the stack is empty.
  The end sentinel is created when the LinkedStack is constructed,
  and each time you call push() a new Node<T> is created and linked to the previous Node<T>.
  When you call pop(), you always return the top.item,
  and then you discard the current Node<T> and move to the next one— except
  when you hit the end sentinel, in which case you don’t move.
  That way, if the client keeps calling pop(), they keep getting null
  back to indicate that the stack is empty.
 */

