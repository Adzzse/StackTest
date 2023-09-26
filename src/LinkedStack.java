
import java.util.EmptyStackException;

class LinkedStack {

    protected Node head;

    public LinkedStack() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(Object x) {
        head = new Node(x, head);
    }

    Object top(){
        if (isEmpty()) {
            System.out.println("Empty");
        }
        return (head.info);
    }

    public Object pop(){
        if (isEmpty()) {
            System.out.println("Empty");;
        }
        Object x = head.info;
        head = head.next;
        return (x);
    }

}
