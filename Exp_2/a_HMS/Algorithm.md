
### 1. Class Definitions:

* **`Patient` Class:**
    * **Attributes:** `name`, `age`, `gender`, `patientId`.
    * **Constructor:** Initializes these attributes.
    * **Method `displayInfo()`:** Prints basic patient details.

* **`InPatient` Class (extends `Patient`):**
    * **Additional Attributes:** `wardNumber`, `bedNumber`, `admissionDate`.
    * **Constructor:** Calls parent constructor and initializes additional attributes.
    * **Method `displayInPatientInfo()`:** Calls `displayInfo()` then prints ward, bed, and admission date.

* **`OutPatient` Class (extends `Patient`):**
    * **Additional Attributes:** `appointmentDate`, `doctorName`.
    * **Constructor:** Calls parent constructor and initializes additional attributes.
    * **Method `displayOutPatientInfo()`:** Calls `displayInfo()` then prints appointment date and doctor's name.

* **`EmergencyPatient` Class (extends `Patient`):**
    * **Additional Attributes:** `emergencyLevel`, `arrivalTime`.
    * **Constructor:** Calls parent constructor and initializes additional attributes.
    * **Method `displayEmergencyPatientInfo()`:** Calls `displayInfo()` then prints emergency level and arrival time.

---

### 2. Main Program Flow:

1.  **Start.**
2.  **Create Objects:**
    * Instantiate an `InPatient` object with specific details.
    * Instantiate an `OutPatient` object with specific details.
    * Instantiate an `EmergencyPatient` object with specific details.
3.  **Display Information:**
    * Print "InPatient Info" and call `inPatient.displayInPatientInfo()`.
    * Print "OutPatient Info" and call `outPatient.displayOutPatientInfo()`.
    * Print "EmergencyPatient Info" and call `emergencyPatient.displayEmergencyPatientInfo()`.
4.  **End.**