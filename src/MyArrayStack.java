
import java.util.ArrayList;

public class MyArrayStack {

    ArrayList h;

    MyArrayStack() {
        h = new ArrayList();
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
        return (h.remove(h.size() - 1));
    }

}
