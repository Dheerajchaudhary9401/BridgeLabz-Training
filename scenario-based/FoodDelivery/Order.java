package FoodDelivery;

public class Order {
	int orderNumber;
	String itemName;
	String customerName;
	boolean isActive = true;
	public Order(int orderNumber, String itemName, String customerName){
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.itemName = itemName;
	}
}
