import bank.*;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bankAcc = new Bank();
        System.out.println("\tWelcome to the IT Bank\n");

        while (true) {
            System.out.print("Please select from an option below : \n");
            System.out.print("""
                    1. Create Account
                    2. Display Account
                    3. Withdraw Money
                    4. Deposit Money
                    5. Change PIN
                    6. Check Balance
                    7. Close Account
                    8. Exit
                    """);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> bankAcc.createAccount();
                case 2 -> bankAcc.displayAccount();
                case 3 -> bankAcc.withdraw();
                case 4 -> bankAcc.deposit();
                case 5 -> bankAcc.changePin();
                case 6 -> bankAcc.checkBalance();
                case 7 -> bankAcc.closeAccount();
                case 8 -> {
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}