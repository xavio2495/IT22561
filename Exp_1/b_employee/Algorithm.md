
1.  **Start the Program:** Begin the execution of the application.
2.  **Initialize Employee Object:** Create an instance of the `Emp` class. This object will hold all the details for a specific employee.
3.  **Gather Employee Information:**
    * Prompt the user to **enter the employee's name** and store it in the `name` attribute of the `Emp` object.
    * Prompt the user to **enter the employee's ID** and store it in the `id` attribute.
    * Prompt the user to **enter the employee's designation** and store it in the `Designation` attribute.
    * Prompt the user to **enter the employee's basic salary** and store it in the `salary` attribute.
4.  **Compute Final Salary:** Call the `Calc()` method on the `Emp` object. This method performs the following calculations:
    * `finalSalary = salary + (salary * hra) + (salary * da) - (salary * pf)`
    * (Where `hra` is 0.2, `da` is 0.1, and `pf` is 0.08 of the basic salary).
5.  **Display Employee Details:** Invoke the `displayDetails()` method on the `Emp` object. This method will print out all the collected and calculated information:
    * Employee Name
    * Employee ID
    * Designation
    * Basic Salary
    * House Rent Allowance (HRA) amount
    * Dearness Allowance (DA) amount
    * Provident Fund (PF) amount
    * Final Calculated Salary
6.  **End the Program:** Terminate the application's execution.

