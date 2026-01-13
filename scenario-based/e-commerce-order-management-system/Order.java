class Order {
    private int orderId;
    private Product product;
    private Customer customer;
    private String status;

    public Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "PLACED";
        System.out.println("Order Created:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + product.getName());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Status: " + status);
        System.out.println();
    }

    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order cancelled");
    }

    public void trackOrder() {
        System.out.println("Order Status: " + status);
    }

    public void processPayment(Payment payment) {
        try {
            payment.pay(product.getPrice());
            System.out.println("Payment successful");
        } catch (PaymentFailedException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}
