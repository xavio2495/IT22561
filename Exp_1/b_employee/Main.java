import java.util.Scanner;
class Emp {
    // Employee class to represent an employee with basic attributes
    String name;
    int id;
    String Designation;
    int salary;
    double hra=0.2;
    double da=0.1;
    double pf=0.08;
    double finalSalary;

    // Method to calculate final salary based on basic salary
    public void Calc(){
        finalSalary = salary + (salary * hra) + (salary * da) - (salary * pf);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("\n------------------- Employee Details ------------------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + Designation);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + (salary * hra));
        System.out.println("DA: " + (salary * da));
        System.out.println("PF: " + (salary * pf));
        System.out.println("Gross Salary: " + (finalSalary + (salary * pf)));
        System.out.println("Net Salary: " + finalSalary);

    }
}

public class Main{
public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Emp emp = new Emp();
        
        // Input employee details
        System.out.print("Enter employee name: ");
        emp.name = x.next();
        
        System.out.print("Enter employee ID: ");
        emp.id = x.nextInt();
        System.out.print("Enter employee designation: ");
        emp.Designation = x.next();
        System.out.print("Enter employee basic salary: ");
        emp.salary = x.nextInt();
        // Calculate final salary
        emp.Calc();
        // display its details
        emp.displayDetails();
        x.close();
    }
}
