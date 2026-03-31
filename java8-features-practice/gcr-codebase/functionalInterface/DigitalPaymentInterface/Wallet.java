package functionalInterface.DigitalPaymentInterface;

public class Wallet implements Payment{
	public void pay() {
		System.out.println("Payment using UPI");
	}
}
