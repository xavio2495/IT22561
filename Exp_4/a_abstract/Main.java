
import java.util.Scanner;

abstract class Employee {

    protected String name;
    protected String employeeId;

    public abstract void calculateSalary();

    public abstract void getDetails();
}

class FullTimeEmployee extends Employee {

    private double monthlySalary;
    private double bonus;

    @Override
    public void calculateSalary() {
        int hra = (int) (0.1 * monthlySalary);
        int da = (int) (0.05 * monthlySalary);
        int ta = (int) (0.02 * monthlySalary);
        System.out.println("--------------------------------------------");
        System.out.println("House Rent Allowance  : $" + hra);
        System.out.println("Dearness Allowance    : $" + da);
        System.out.println("Travel Allowance      : $" + ta);
        System.out.print("Total Salary/Month    : $" + (monthlySalary + bonus + hra + da + ta));
    }

    @Override
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Full-time Employee Salary Calculator ---");
        System.out.print("Enter your Name: ");
        super.name = scanner.next();
        System.out.print("Enter your Employee ID: ");
        super.employeeId = scanner.next();
        System.out.print("Enter your Monthly Salary: ");
        this.monthlySalary = scanner.nextDouble();
        System.out.print("Enter your Bonus: ");
        this.bonus = scanner.nextDouble();
        calculateSalary();
    }
}

class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    @Override
    public void calculateSalary() {
        int bonus = (int) (0.05 * (hourlyRate * hoursWorked));
        int ta = (int) (0.02 * (hourlyRate * hoursWorked));
        System.out.println("--------------------------------------------");
        System.out.println("Bonus                 : $" + bonus);
        System.out.println("Travel Allowance      : $" + ta);
        System.out.println("Total Salary/Day      : $" + ((hourlyRate * hoursWorked)+ bonus + ta));
    }

    @Override
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Part-time Employee Salary Calculator ---");
        System.out.print("Enter your Name: ");
        super.name = scanner.next();
        System.out.print("Enter your Employee ID: ");
        super.employeeId = scanner.next();
        System.out.print("Enter your Hourly rate: ");
        this.hourlyRate = scanner.nextDouble();
        System.out.print("Enter your Hours Worked: ");
        this.hoursWorked = scanner.nextInt();
        calculateSalary();
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Demonstrating Abstract Class and Inheritance:\n");
        Employee ftEmployee = new FullTimeEmployee();
        ftEmployee.getDetails();
        System.out.println("\n");
        Employee ptEmployee = new PartTimeEmployee();
        ptEmployee.getDetails();
    }
}
