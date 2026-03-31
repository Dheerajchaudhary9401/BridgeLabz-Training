package review;
import java.util.Stack;

class Q {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void push(int n) {
        stack1.push(n);
    }

    public void remove() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (!stack2.isEmpty()) {
            System.out.println("Removed Element: " + stack2.pop());
        } else {
            System.out.println("Queue is empty");
        }
    }
}

public class ImplementQueue {
    public static void main(String[] args) {
        Q queue = new Q();
        queue.push(4);
        queue.push(8);
        queue.push(9);
        queue.remove();
        queue.push(5);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }
}
