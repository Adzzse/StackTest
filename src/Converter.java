
public class Converter {

    public void converter(int x) {
        LinkedStack ten = new LinkedStack();
        int two;
        while (x != 0) {
            two = x % 2;
            ten.push(two);
            x = x / 2;
        }
        if (ten.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Pop elements:");
            while (!ten.isEmpty()) {
                System.out.print(ten.pop() + " ");
            }
        }
    }
}
