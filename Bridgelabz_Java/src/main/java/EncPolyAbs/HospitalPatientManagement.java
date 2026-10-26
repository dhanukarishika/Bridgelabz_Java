/*
  This program demonstrates abstraction, inheritance, encapsulation and interfaces in a Hospital Patient Management System.
  It manages in-patients and out-patients with medical records and bill calculation.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;

// Abstract class containing common patient details and methods
abstract class Patient {

    int patientId;
    String name;
    int age;

    // Private variables provide encapsulation for sensitive patient information
    private String diagnosis;
    private String medicalHistory;

    Patient(int patientId, String name, int age, String diagnosis, String medicalHistory) {
        // Initializes the patient details
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    // Getter method to access diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // Setter method to update diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Getter method to access medical history
    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Setter method to update medical history
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Abstract method that must be implemented by child classes
    abstract void calculateBill();

    // Displays the common patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }
}

// Interface defining medical record operations
interface MedicalRecord {

    void addRecord();

    void viewRecords();
}

// InPatient inherits Patient and implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {

    double roomCharges;
    double doctorCharges;
    double medicineCharges;
    double totalBill;

    List<Patient> patients;

    InPatient(int patientId, String name, int age,
              String diagnosis, String medicalHistory,
              double roomCharges, double doctorCharges, double medicineCharges) {

        // Calls the parent class constructor
        super(patientId, name, age, diagnosis, medicalHistory);

        this.roomCharges = roomCharges;
        this.doctorCharges = doctorCharges;
        this.medicineCharges = medicineCharges;

        // Creates a list to store patients
        patients = new ArrayList<>();
    }

    // Adds an in-patient to the patient list
    public void addInPatient(InPatient patient) {
        patients.add(patient);
    }

    // Calculates the total bill for an in-patient
    @Override
    void calculateBill() {
        totalBill = roomCharges + doctorCharges + medicineCharges;
    }

    // Adds a medical record for the in-patient
    @Override
    public void addRecord() {
        System.out.println("Medical record added for InPatient");
    }

    // Displays the medical records of the patient
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }

    // Displays all in-patient details and bill information
    public void displayPatients() {

        // Iterates through all patients stored in the list
        for (Patient patient : patients) {

            patient.getPatientDetails();

            System.out.println("Room Charges: " + roomCharges);
            System.out.println("Doctor Charges: " + doctorCharges);
            System.out.println("Medicine Charges: " + medicineCharges);
            System.out.println("Total Bill: " + totalBill);

            System.out.println();
        }
    }
}

// OutPatient inherits Patient and implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {

    double consultationFee;
    double medicineCharges;
    double testCharges;
    double totalBill;

    List<Patient> patients;

    OutPatient(int patientId, String name, int age,
               String diagnosis, String medicalHistory,
               double consultationFee, double medicineCharges, double testCharges) {

        // Calls the parent class constructor
        super(patientId, name, age, diagnosis, medicalHistory);

        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
        this.testCharges = testCharges;

        // Creates a list to store patients
        patients = new ArrayList<>();
    }

    // Adds an out-patient to the patient list
    public void addOutPatient(OutPatient patient) {
        patients.add(patient);
    }

    // Calculates the total bill for an out-patient
    @Override
    void calculateBill() {
        totalBill = consultationFee + medicineCharges + testCharges;
    }

    // Adds a medical record for the out-patient
    @Override
    public void addRecord() {
        System.out.println("Medical record added for OutPatient");
    }

    // Displays the medical records of the patient
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Medical History: " + getMedicalHistory());
    }

    // Displays all out-patient details and bill information
    public void displayPatients() {

        // Iterates through all patients stored in the list
        for (Patient patient : patients) {

            patient.getPatientDetails();

            System.out.println("Consultation Fee: " + consultationFee);
            System.out.println("Medicine Charges: " + medicineCharges);
            System.out.println("Test Charges: " + testCharges);
            System.out.println("Total Bill: " + totalBill);

            System.out.println();
        }
    }
}

// Main class for managing hospital patients
public class HospitalPatientManagement {

    public static void main(String[] args) {

        // Creates an in-patient object with patient and billing details
        InPatient inPatient =
                new InPatient(
                        101,
                        "Akhil",
                        22,
                        "Fever",
                        "Previous fever treatment",
                        3000,
                        1500,
                        1000
                );

        // Adds the in-patient to the patient list
        inPatient.addInPatient(inPatient);

        // Calculates the in-patient bill
        inPatient.calculateBill();

        // Adds the medical record
        inPatient.addRecord();

        System.out.println("----- IN PATIENT -----");

        // Displays the in-patient details and bill
        inPatient.displayPatients();

        // Creates an out-patient object with patient and billing details
        OutPatient outPatient =
                new OutPatient(
                        102,
                        "Rahul",
                        25,
                        "Cold",
                        "No previous history",
                        500,
                        300,
                        700
                );

        // Adds the out-patient to the patient list
        outPatient.addOutPatient(outPatient);

        // Calculates the out-patient bill
        outPatient.calculateBill();

        // Adds the medical record
        outPatient.addRecord();

        System.out.println("----- OUT PATIENT -----");

        // Displays the out-patient details and bill
        outPatient.displayPatients();
    }
}