import java.util.Deque;
import java.util.ArrayDeque;

public class CreateStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);  // Push elements
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());  // Peek without removing
        System.out.println("Popped: " + stack.pop());  // Pop top (30)
    }
}
