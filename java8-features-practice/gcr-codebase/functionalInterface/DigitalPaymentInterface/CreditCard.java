package functionalInterface.DigitalPaymentInterface;

public class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment using Credit Card");
	}
}
