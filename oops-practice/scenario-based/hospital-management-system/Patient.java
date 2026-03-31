import java.util.ArrayList;

public class Patient extends Person {
    private int age;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public Patient(int id, String name, int age) {
        super(id, name);
        this.age = age;

        System.out.println("Patient Added:");
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        System.out.println();
    }

    public void addMedicalRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewMedicalHistory() {
        System.out.println("Medical History of " + name + ":");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
        System.out.println();
    }
}
