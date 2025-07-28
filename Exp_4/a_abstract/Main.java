abstract class Employee {
    protected String name;
    protected String employeeId;
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public abstract double calculateSalary();
    public abstract void printDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;
    public FullTimeEmployee(String name, String employeeId, double monthlySalary, double bonus) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }
    @Override
    public void printDetails() {
        System.out.println("--- Full-Time Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Calculated Total Salary: $" + calculateSalary()); // Calls calculateSalary
        System.out.println("----------------------------------");
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId); // Call parent class constructor
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    @Override
    public void printDetails() {
        System.out.println("--- Part-Time Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Calculated Total Salary: $" + calculateSalary()); // Calls calculateSalary
        System.out.println("----------------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating Abstract Class and Inheritance:\n");
        Employee ftEmployee = new FullTimeEmployee("Alice Smith", "FT001", 5000.0, 500.0);
        ftEmployee.printDetails();
        System.out.println("\n");
        Employee ptEmployee = new PartTimeEmployee("Bob Johnson", "PT005", 25.0, 120);
        ptEmployee.printDetails();
    }
} 
