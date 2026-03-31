package functionalInterface.DigitalPaymentInterface;

public class UPI implements Payment{
	public void pay() {
		System.out.println("Payment using UPI");
	}
}
