## Algorithm
1.  Define the **`Patient` class** with attributes and a `displayInfo()` method.
2.  Define **`InPatient`**, **`OutPatient`**, and **`EmergencyPatient`** classes, each extending `Patient`.
3.  Add **specific attributes** to each subclass.
4.  Implement **constructors** for all subclasses, initializing their attributes and calling the parent constructor.
5.  Implement **display methods** for each subclass to show their specific details.
6.  In the main program, create an **instance of `InPatient`**.
7.  In the main program, create an **instance of `OutPatient`**.
8.  In the main program, create an **instance of `EmergencyPatient`**.
9.  Call the respective **display methods** for each patient instance.
10. End the program.

## Program Output
```
=== InPatient Info ===
Patient ID: IP001
Name: John Doe   
Age: 45
Gender: Male
Ward Number: Ward 5
Bed Number: 12
Admission Date: 2025-07-15   

=== OutPatient Info ===      
Patient ID: OP001
Name: Jane Smith
Age: 30
Gender: Female
Appointment Date: 2025-07-16 
Doctor Name: Dr. Brown       

=== EmergencyPatient Info ===
Patient ID: EP001
Name: Mike Lee
Age: 60
Gender: Male
Emergency Level: Critical
Arrival Time: 10:30 AM
```