package functionalInterface.PaymentGatewayIntegration;

public interface PaymentProcessor {
	default void refund(double amount) {
		System.out.println("Refunded: "+amount);
	}
}
