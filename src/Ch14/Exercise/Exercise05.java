package Ch14.Exercise;
// TODO: 2020/7/20
/*
  Remove the type parameter on the Node class and modify the rest of
  the code in LinkedStack.java to show that an inner class has access to
  the generic type parameters of its outer class.
 */
/*
public class Exercise05 <T> {

    private static class Node {
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
}
*/
