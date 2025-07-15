// BasicCalc.java
// This is a simple calculator program that performs basic arithmetic operations
// such as addition, subtraction, multiplication, and division.
// It takes two integers and outputs the results of these operations.
import java.util.Scanner;
public class BasicCalc {
    public static void main(String[] args) {
        int a,b;
        Scanner x = new Scanner(System.in);
        a= x.nextInt();
        b= x.nextInt();
        //Sum
        int sum = a + b;
        System.out.println("Sum: " + sum);
        //Difference
        int difference = a - b;
        System.out.println("Difference: " + difference);
        //Product
        int product = a * b;
        System.out.println("Product: " + product);
        // Quotient & Remainder
        float quotient;
        float remainder;
        if(b!=0){
            quotient = a / b;
            remainder = a % b;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
            
        }
    }

}
