
import java.util.Stack;

public class Main {

    static int precedence(char ch) {
        switch (ch) {
            case '+', '-' ->{ return 1;}
            case '*', '/' -> {return 2;}
            case '^' -> { return 3;}
        }
        return -1;
    }

    static String ITP(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // pop the '('
                }
            } else {
                if (ch == '^') {
                    while (!stack.isEmpty() && precedence(stack.peek()) > precedence(ch)) {
                        result.append(stack.pop());
                    }
                } else {
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                        result.append(stack.pop());
                    }
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("\nInfix to Postfix Conversion\n");
        String InfixExp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix Expression:  " + InfixExp);
        System.out.println("Postfix Expression: " + ITP(InfixExp));
    }
}
