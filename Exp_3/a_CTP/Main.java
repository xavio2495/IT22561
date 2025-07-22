class Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    public String calculate(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Enter two integers or doubles, or strings to perform addition:\nEnter X: ");
        System.out.println("Integer result: " + calculator.calculate(5, 10));
        System.out.println("Double result: " + calculator.calculate(5.5, 10.2));
        System.out.println("String result: " + calculator.calculate("Hello, ", "World!"));
    }
}