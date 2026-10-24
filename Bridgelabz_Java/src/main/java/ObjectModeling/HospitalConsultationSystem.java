/*
 * Q6. Hospital, Doctors, and Patients
 * Demonstrate many-to-many association and
 * communication through doctor-patient consultations.
 */
package ObjectModeling;

import java.util.ArrayList;

class Patient {
    private final String name;
    private final ArrayList<Doctor> doctors;

    public Patient(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Patient name cannot be empty."
            );
        }

        this.name = name.trim();
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void displayDoctors() {
        System.out.println("Doctors Consulted by " + name + ":");

        if (doctors.isEmpty()) {
            System.out.println("No consultations yet.");
            return;
        }

        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
    }
}

class Doctor {
    private final String name;
    private final ArrayList<Patient> patients;

    public Doctor(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Doctor name cannot be empty."
            );
        }

        this.name = name.trim();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }

        if (!patients.contains(patient)) {
            patients.add(patient);
        }

        patient.addDoctor(this);

        System.out.println(name + " is consulting " + patient.getName() + ".");
    }

    public void displayPatients() {
        System.out.println("Patients Seen by " + name + ":");

        if (patients.isEmpty()) {
            System.out.println("No consultations yet.");
            return;
        }

        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

class Hospital {
    private final String name;
    private final ArrayList<Doctor> doctors;
    private final ArrayList<Patient> patients;

    public Hospital(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Hospital name cannot be empty."
            );
        }

        this.name = name.trim();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor cannot be null.");
        }

        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }

        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void arrangeConsultation(Doctor doctor, Patient patient) {
        if (!doctors.contains(doctor) || !patients.contains(patient)) {
            throw new IllegalArgumentException(
                    "Doctor and patient must be registered at the hospital."
            );
        }

        doctor.consult(patient);
    }

    public void displayDetails() {
        System.out.println("Hospital: " + name);
        System.out.println("Registered Doctors: " + doctors.size());
        System.out.println("Registered Patients: " + patients.size());
    }
}

public class HospitalConsultationSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Dr. Priya");
        Doctor doctor2 = new Doctor("Dr. Karthik");

        Patient patient1 = new Patient("Rishika");
        Patient patient2 = new Patient("Vaidehi");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.displayDetails();

        System.out.println("\nConsultations");
        hospital.arrangeConsultation(doctor1, patient1);
        hospital.arrangeConsultation(doctor1, patient2);
        hospital.arrangeConsultation(doctor2, patient1);

        System.out.println();
        doctor1.displayPatients();

        System.out.println();
        doctor2.displayPatients();

        System.out.println();
        patient1.displayDoctors();

        System.out.println();
        patient2.displayDoctors();
    }
}