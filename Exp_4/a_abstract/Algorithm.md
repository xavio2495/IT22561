1.  Define an **abstract class** named `Employee` with attributes: `name` and `employeeId`.
2.  Implement a constructor for `Employee` to initialize `name` and `employeeId`.
3.  Declare two **abstract methods** within `Employee`: `calculateSalary()` (returns `double`) and `printDetails()` (returns `void`).
4.  Define a class named `FullTimeEmployee` that **extends** `Employee`.
5.  Add specific attributes to `FullTimeEmployee`: `monthlySalary` and `bonus`.
6.  Implement the constructor for `FullTimeEmployee`, calling the parent constructor and initializing its specific attributes.
7.  **Override** the `calculateSalary()` method in `FullTimeEmployee` to return the sum of `monthlySalary` and `bonus`.
8.  **Override** the `printDetails()` method in `FullTimeEmployee` to display full-time employee's name, ID, monthly salary, bonus, and calculated total salary.
9.  Define a class named `PartTimeEmployee` that **extends** `Employee`.
10. Add specific attributes to `PartTimeEmployee`: `hourlyRate` and `hoursWorked`.
11. Implement the constructor for `PartTimeEmployee`, calling the parent constructor and initializing its specific attributes.
12. **Override** the `calculateSalary()` method in `PartTimeEmployee` to return the product of `hourlyRate` and `hoursWorked`.
13. **Override** the `printDetails()` method in `PartTimeEmployee` to display part-time employee's name, ID, hourly rate, hours worked, and calculated total salary.
14. In the `Main` class's `main` method, print an introductory message.
15. Create an `Employee` reference `ftEmployee` and assign it a new `FullTimeEmployee` object with specific details.
16. Call `ftEmployee.printDetails()` to display the full-time employee's information.
17. Create an `Employee` reference `ptEmployee` and assign it a new `PartTimeEmployee` object with specific details.
18. Call `ptEmployee.printDetails()` to display the part-time employee's information.