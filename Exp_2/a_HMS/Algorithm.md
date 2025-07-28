1.  Define a `Patient` class with attributes: `name`, `age`, `gender`, `patientId`.
2.  Implement a constructor for `Patient` to initialize its attributes.
3.  Implement a `displayInfo()` method in `Patient` to print patient details.
4.  Define an `InPatient` class that extends `Patient`.
5.  Add `wardNumber`, `bedNumber`, `admissionDate` as attributes to `InPatient`.
6.  Implement `InPatient`'s constructor to call the parent constructor and initialize its own attributes.
7.  Implement `displayInPatientInfo()` method in `InPatient` to call `displayInfo()` then print its specific attributes.
8.  Define an `OutPatient` class that extends `Patient`.
9.  Add `appointmentDate`, `doctorName` as attributes to `OutPatient`.
10. Implement `OutPatient`'s constructor to call the parent constructor and initialize its own attributes.
11. Implement `displayOutPatientInfo()` method in `OutPatient` to call `displayInfo()` then print its specific attributes.
12. Define an `EmergencyPatient` class that extends `Patient`.
13. Add `emergencyLevel`, `arrivalTime` as attributes to `EmergencyPatient`.
14. Implement `EmergencyPatient`'s constructor to call the parent constructor and initialize its own attributes.
15. Implement `displayEmergencyPatientInfo()` method in `EmergencyPatient` to call `displayInfo()` then print its specific attributes.
16. In the main program, create an instance of `InPatient` with specific data.
17. In the main program, create an instance of `OutPatient` with specific data.
18. In the main program, create an instance of `EmergencyPatient` with specific data.
19. Print "InPatient Info" and then call the `displayInPatientInfo()` method on the `InPatient` object.
20. Print "OutPatient Info" and then call the `displayOutPatientInfo()` method on the `OutPatient` object.
21. Print "EmergencyPatient Info" and then call the `displayEmergencyPatientInfo()` method on the `EmergencyPatient` object.
22. End the program.