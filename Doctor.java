
public class Doctor {

    int id;
    String name;
    String specialization;

    public Doctor(int id, String name,
                  String specialization) {

        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDoctor() {

        System.out.println("Doctor ID: " + id);
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("-------------------------");
    }
}
