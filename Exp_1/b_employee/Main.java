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
    Emp(String name, int id, String Designation, int salary) {
        this.name = name;
        this.id = id;
        this.Designation = Designation;
        this.salary = salary;
    }
    // Method to calculate final salary based on basic salary
    public void Calc(){
        finalSalary = salary + (salary * hra) + (salary * da) - (salary * pf);
    }

    // Method to display employee details
    public void displayDetails() {
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
        System.out.print("Enter the number of employees: ");
        int n = x.nextInt();
        Emp emp[] = new Emp[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee - " + (i + 1) + ":");
            System.out.print("Enter employee name: ");
            String name = x.next();
            System.out.print("Enter employee ID: ");
            int id = x.nextInt();
            System.out.print("Enter employee designation: ");
            String Designation = x.next();
            System.out.print("Enter employee basic salary: ");
            int salary = x.nextInt();
            emp[i] = new Emp(name, id, Designation, salary);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\n Calculated salary for Employee - " + (i + 1) + ":");
            emp[i].Calc();
            emp[i].displayDetails();
        }
        x.close();
    }
}
