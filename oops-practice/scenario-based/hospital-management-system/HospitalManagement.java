import java.util.ArrayList;

class HospitalManagement implements HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public void deletePatient(int patientId) {
        patients.removeIf(p -> p.id == patientId);
        System.out.println("Patient Deleted with ID: " + patientId);
        System.out.println();
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    @Override
    public void bookAppointment(Patient patient, Doctor doctor, String date)
            throws AppointmentNotAvailableException {

        if (doctors.isEmpty()) {
            throw new AppointmentNotAvailableException("No doctors available");
        }

        new Appointment(patient, doctor, date);

        System.out.println("Consultation Fee: ₹" +
                doctor.calculateConsultationFee());
        System.out.println();
    }
}
