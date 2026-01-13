class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;

        System.out.println("Appointment Booked:");
        System.out.println("Patient: " + patient.name);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date: " + date);
        System.out.println();
    }
}
