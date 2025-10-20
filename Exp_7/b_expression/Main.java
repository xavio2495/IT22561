import java.util.Stack;
public class Main {
    static int EvalPostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+' -> stack.push(val1 + val2);
                    case '-' -> stack.push(val1 - val2);
                    case '*' -> stack.push(val1 * val2);
                    case '/' -> stack.push(val1 / val2);
                    case '^' -> stack.push((int) Math.pow(val1, val2));
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String PostfixExp = "352*+9-";
        System.out.println("Postfix Expression: " + PostfixExp);
        System.out.println("Evaluation Result: " + EvalPostfix(PostfixExp));
    }
}
