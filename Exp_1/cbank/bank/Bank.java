package bank;
import java.util.Scanner;
public class Bank {
    int accNo;
    String accName;
    double balance;
    String accType;
    int pin;
    Scanner scanner = new Scanner(System.in);

    //create new account
    public void createAccount() {
        System.out.print("Enter Account Number: ");
        accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Account Name: ");
        accName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Account Type (Savings/Current): ");
        accType = scanner.nextLine();
        System.out.print("Set a PIN: ");
        pin = scanner.nextInt();
        System.out.println("Account created successfully!");
        
    }
    //display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Name: " + accName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accType);
        System.out.println("PIN: " + pin);
    }
    //withdraw money from account
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
       
    }
    //deposit money into account
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
       
    }
    //change account PIN
    public void changePin() {
        System.out.print("Enter new PIN: ");
        int newPin = scanner.nextInt();
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("Invalid PIN. Please enter a 4-digit number.");
            return;
        }
        pin = newPin;
        System.out.println("PIN changed successfully.");
        
    }
    //check account balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    //close account
    public void closeAccount() {
        System.out.println("Account closed. Final balance: " + balance);
        accNo = 0;
        accName = null;
        balance = 0;
        accType = null;
        pin = 0;
    }
}
