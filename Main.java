
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("    HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("================================");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. View Doctors");
            System.out.println("6. Book Appointment");
            System.out.println("7. View Appointments");
            System.out.println("8. Generate Bill");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    hospital.addPatient(
                        new Patient(pid, pname, age, gender, disease)
                    );

                    break;

                case 2:

                    hospital.viewPatients();
                    break;

                case 3:

                    System.out.print("Enter Patient ID: ");
                    int searchId = sc.nextInt();

                    hospital.searchPatient(searchId);
                    break;

                case 4:

                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();

                    hospital.addDoctor(
                        new Doctor(did, dname, specialization)
                    );

                    break;

                case 5:

                    hospital.viewDoctors();
                    break;

                case 6:

                    System.out.print("Enter Appointment ID: ");
                    int aid = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int apid = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int adid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Appointment Date: ");
                    String date = sc.nextLine();

                    hospital.bookAppointment(
                        new Appointment(aid, apid, adid, date)
                    );

                    break;

                case 7:

                    hospital.viewAppointments();
                    break;

                case 8:

                    System.out.print("Enter Patient ID: ");
                    int billId = sc.nextInt();

                    System.out.print("Enter Bill Amount: ");
                    double amount = sc.nextDouble();

                    hospital.generateBill(billId, amount);
                    break;

                case 9:

                    System.out.println("Thank you for using our system!");
                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}
