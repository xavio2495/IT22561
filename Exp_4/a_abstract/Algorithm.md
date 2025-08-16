## Algorithm
1.  Create an `Employee` abstract class with `name`, `employeeId`,`calculateSalary()` and `getDetails()`.
2.  Define `FullTimeEmployee` that extends `Employee`, adding `monthlySalary` and `bonus` attributes.
3.  Override `calculateSalary()` in `FullTimeEmployee` to return `(monthlySalary+bonus)*12`.
4.  Override `getDetails()` in `FullTimeEmployee` to get full-time employee information
5.  Define `PartTimeEmployee` that extends `Employee`, adding `hourlyRate` and `hoursWorked` attributes.
6.  Override `calculateSalary()` in `PartTimeEmployee` to return `hourlyRate*hoursWorked`.
7.  Override `getDetails()` in `PartTimeEmployee` to get relevant part-time employee information
8. In the `main` method, create instances of both `FullTimeEmployee` and `PartTimeEmployee` using an `Employee` reference, and call `getDetails()` on each to demonstrate polymorphism.

## Output
```
Demonstrating Abstract Class and Inheritance:

--- Full-time Employee Salary Calculator ---
Enter your Name: Immanuel
Enter your Employee ID: 1005
Enter your Monthly Salary: 50000
Enter your Bonus: 25000
--------------------------------------------
Total Salary/Year: $900000.0


--- Part-time Employee Salary Calculator ---
Enter your Name: Antony
Enter your Employee ID: 1015
Enter your Hourly rate: 80
Enter your Hours Worked: 6
--------------------------------------------
Total Salary/Day: $480.0
```