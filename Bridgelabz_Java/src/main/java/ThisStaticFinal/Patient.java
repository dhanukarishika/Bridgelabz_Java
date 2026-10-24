/*
 * Q7. Hospital Management System
 * Demonstrate static, this, final, and instanceof
 * using patient details and a shared patient counter.
 */
package ThisStaticFinal;
public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(String patientID, String name, int age, String ailment) {
        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (ailment == null || ailment.trim().isEmpty()) {
            throw new IllegalArgumentException("Ailment cannot be empty.");
        }
        this.patientID = patientID.trim();
        this.name = name.trim();
        this.age = age;
        this.ailment = ailment.trim();
        totalPatients++;
    }
    public String getPatientID() {
        return patientID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }
    public String getAilment() {
        return ailment;
    }
    public void setAilment(String ailment) {
        if (ailment == null || ailment.trim().isEmpty()) {
            throw new IllegalArgumentException("Ailment cannot be empty.");
        }
        this.ailment = ailment.trim();
    }
    public static int getTotalPatients() {
        return totalPatients;
    }
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
    public static void main(String[] args) {
        Patient patient1 = new Patient("PAT101", "Rishika Dhanuka", 21, "Fever");
        Patient patient2 = new Patient("PAT102", "Vaidehi Mishra", 22, "Headache");
        Object[] patients = {patient1, patient2, "Not a patient"};
        for (Object object : patients) {
            if (object instanceof Patient) {
                Patient patient = (Patient) object;
                patient.displayDetails();
            } else {
                System.out.println("The object is not a Patient.");
            }
            System.out.println();
        }
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}