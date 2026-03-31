class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;

        System.out.println("Doctor Added:");
        System.out.println("ID: " + id + ", Name: " + name +
                ", Specialization: " + specialization);
        System.out.println();
    }

    // Polymorphic behavior
    public double calculateConsultationFee() {
        return 500;
    }

    public String getName() {
        return name;
    }
}
