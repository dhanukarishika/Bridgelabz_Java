package Collections.Queue;
import java.util.*;
/*
 * Q3. Hospital Triage System
 * Treat patients based on severity using a PriorityQueue.
 */
public class HospitalTriageSystem {
    static class Patient {
        String name;
        int severity;
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
    // Treat patients in descending order of severity
    public static void treatPatients(Queue<Patient> patients) {
        while (!patients.isEmpty()) {
            Patient patient = patients.poll();
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }
    public static void main(String[] args) {
        // Higher severity gets higher priority
        Queue<Patient> patients = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );
        patients.add(new Patient("John", 3));
        patients.add(new Patient("Alice", 5));
        patients.add(new Patient("Bob", 2));
        System.out.println("Patient Treatment Order:");
        treatPatients(patients);
    }
}