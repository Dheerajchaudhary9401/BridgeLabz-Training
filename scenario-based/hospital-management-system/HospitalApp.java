public class HospitalApp {
    public static void main(String[] args) {

        HospitalService hospital = new HospitalManagement();

        Patient p1 = new Patient(101, "Dheeraj", 22);
        p1.addMedicalRecord("Fever");
        p1.addMedicalRecord("Blood Test");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiologist");

        hospital.addPatient(p1);
        hospital.addDoctor(d1);

        try {
            hospital.bookAppointment(p1, d1, "12-Jan-2026");
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        p1.viewMedicalHistory();

        hospital.deletePatient(101);
    }
}
