package ss11_dsa_stack_queue.bai_tap.bai1;

import java.util.Arrays;
import java.util.Stack;

public class StringReverserThroughStack {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push("QB");
        stack.push("Giang");
        stack.push("Linh");
        stack.push("Tran");

        System.out.println("before reverse: " + Arrays.toString(stack.toArray()));

        Stack newStack = new Stack<>();

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            newStack.push(stack.pop());
        }

        System.out.println("after reverse: " + Arrays.toString(newStack.toArray()));
    }
}
