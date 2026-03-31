package functionalInterface.DigitalPaymentInterface;

public class DigitalPayment {

	public static void main(String[] args) {
		UPI upi = new UPI();
		Wallet wallet = new Wallet();
		CreditCard creditCard = new CreditCard();
		
		upi.pay();
		wallet.pay();
		creditCard.pay();

	}

}
