interface HospitalService {
    void addPatient(Patient patient);
    void deletePatient(int patientId);

    void addDoctor(Doctor doctor);

    void bookAppointment(Patient patient, Doctor doctor, String date)
            throws AppointmentNotAvailableException;
}
