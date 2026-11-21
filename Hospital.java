
import java.util.ArrayList;

public class Hospital {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    // Add Patient
    public void addPatient(Patient p) {
        patients.add(p);
        System.out.println("Patient added successfully!");
    }

    // View Patients
    public void viewPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patients) {
            p.displayPatient();
        }
    }

    // Search Patient
    public void searchPatient(int id) {

        for (Patient p : patients) {

            if (p.id == id) {
                p.displayPatient();
                return;
            }
        }

        System.out.println("Patient not found!");
    }

    // Add Doctor
    public void addDoctor(Doctor d) {
        doctors.add(d);
        System.out.println("Doctor added successfully!");
    }

    // View Doctors
    public void viewDoctors() {

        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        for (Doctor d : doctors) {
            d.displayDoctor();
        }
    }

    // Book Appointment
    public void bookAppointment(Appointment a) {

        boolean patientExists = false;
        boolean doctorExists = false;

        for (Patient p : patients) {
            if (p.id == a.patientId) {
                patientExists = true;
                break;
            }
        }

        for (Doctor d : doctors) {
            if (d.id == a.doctorId) {
                doctorExists = true;
                break;
            }
        }

        if (patientExists && doctorExists) {
            appointments.add(a);
            System.out.println("Appointment booked successfully!");
        } else {
            System.out.println("Invalid patient or doctor ID!");
        }
    }

    // View Appointments
    public void viewAppointments() {

        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment a : appointments) {
            a.displayAppointment();
        }
    }

    // Generate Bill
    public void generateBill(int patientId, double amount) {

        boolean found = false;

        for (Patient p : patients) {

            if (p.id == patientId) {
                found = true;

                System.out.println("\n========== HOSPITAL BILL ==========");
                System.out.println("Patient Name: " + p.name);
                System.out.println("Patient ID: " + p.id);
                System.out.println("Disease: " + p.disease);
                System.out.println("Total Amount: Rs. " + amount);
                System.out.println("===================================");
                break;
            }
        }

        if (!found) {
            System.out.println("Patient not found!");
        }
    }
}
