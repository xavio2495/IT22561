import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers or doubles, or strings to perform addition:\nEnter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();
        System.out.println("Integer result: " + calculator.calculate(x, y));
        System.out.print("Enter first double: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b = scanner.nextDouble();
        System.out.println("Double result: " + calculator.calculate(a, b));
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        System.out.println("String result: " + calculator.calculate(str1, str2));
        scanner.close();
    }
}