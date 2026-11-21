
public class Appointment {

    int appointmentId;
    int patientId;
    int doctorId;
    String date;

    public Appointment(int appointmentId,
                       int patientId,
                       int doctorId,
                       String date) {

        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    public void displayAppointment() {

        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Date: " + date);
        System.out.println("-------------------------");
    }
}
