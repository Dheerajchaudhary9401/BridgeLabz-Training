public class ECommerceApp {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 45000);
        Customer c1 = new Customer(1, "Dheeraj");

        Order order = new Order(5001, p1, c1);

        Payment payment = new UPIPayment(); // Polymorphism
        order.processPayment(payment);

        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }
}
