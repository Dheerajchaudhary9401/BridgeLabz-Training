class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        System.out.println("Customer Created:");
        System.out.println("Customer Name: " + name);
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
