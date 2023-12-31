package ss11_dsa_stack_queue.bai_tap.bai5;

import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        System.out.println(checkBrackets("s * (s – a) * (s – b) * (s – c)"));
        System.out.println(checkBrackets("(– b + {b2 – 4*a*c)^0.5) / 2*a "));
        System.out.println(checkBrackets("s * (s – a) * (s – b * (s – c) "));
        System.out.println(checkBrackets("(– b + (b^2 – 4*a*c]^(0.5/ 2*a)) "));
        System.out.println(checkBrackets(" "));
    }

    public static boolean checkBrackets(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (character == '[' || character == '(' || character == '{') {
                stack.push(character);
            } else if (character == ']') {
                if (stack.isEmpty() || stack.pop() == '[') {
                    return true;
                } else {
                    return false;
                }
            } else if (character == ')') {
                if (stack.isEmpty() || stack.pop() == '(') {
                    return true;
                } else {
                    return false;
                }
            } else if (character == '}') {
                if (stack.isEmpty() || stack.pop() == '{') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
