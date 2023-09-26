
import java.util.LinkedList;

public class MyLinkedStack {

    LinkedList h;

    MyLinkedStack() {
        h = new LinkedList();
    }

    boolean isEmpty() {
        return (h.isEmpty());
    }

    void push(Object x) {
        h.add(x);
    }

    Object pop() {
        if (isEmpty()) {
            return (null);
        }
        return (h.removeLast());
    }

}
