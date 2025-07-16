class Patient {
    protected String name;
    protected int age;
    protected String gender;
    protected String patientId;

    public Patient(String name, int age, String gender, String patientId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.patientId = patientId;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class InPatient extends Patient {
    private String wardNumber;
    private int bedNumber;
    private String admissionDate;

    public InPatient(String name, int age, String gender, String patientId, String wardNumber, int bedNumber,
            String admissionDate) {
        super(name, age, gender, patientId);
        this.wardNumber = wardNumber;
        this.bedNumber = bedNumber;
        this.admissionDate = admissionDate;
    }

    public void displayInPatientInfo() {
        displayInfo();
        System.out.println("Ward Number: " + wardNumber);
        System.out.println("Bed Number: " + bedNumber);
        System.out.println("Admission Date: " + admissionDate);
    }
}

class OutPatient extends Patient {
    private String appointmentDate;
    private String doctorName;

    public OutPatient(String name, int age, String gender, String patientId, String appointmentDate,
            String doctorName) {
        super(name, age, gender, patientId);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public void displayOutPatientInfo() {
        displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Doctor Name: " + doctorName);
    }
}

class EmergencyPatient extends Patient {
    private String emergencyLevel;
    private String arrivalTime;

    public EmergencyPatient(String name, int age, String gender, String patientId, String emergencyLevel,
            String arrivalTime) {
        super(name, age, gender, patientId);
        this.emergencyLevel = emergencyLevel;
        this.arrivalTime = arrivalTime;
    }

    public void displayEmergencyPatientInfo() {
        displayInfo();
        System.out.println("Emergency Level: " + emergencyLevel);
        System.out.println("Arrival Time: " + arrivalTime);
    }
}

public class Main {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("John Doe", 45, "Male", "IP001", "Ward 5", 12, "2025-07-15");
        OutPatient outPatient = new OutPatient("Jane Smith", 30, "Female", "OP001", "2025-07-16", "Dr. Brown");
        EmergencyPatient emergencyPatient = new EmergencyPatient("Mike Lee", 60, "Male", "EP001", "Critical",
                "10:30 AM");

        System.out.println("=== InPatient Info ===");
        inPatient.displayInPatientInfo();

        System.out.println("\n=== OutPatient Info ===");
        outPatient.displayOutPatientInfo();

        System.out.println("\n=== EmergencyPatient Info ===");
        emergencyPatient.displayEmergencyPatientInfo();
    }
}