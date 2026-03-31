package functionalInterface.MultiVehicleRentalSystem;

public class Car implements Rental {
	public void rent() {
		System.out.println("Car is rented");
	}
	public void returnVehicle() {
		System.out.println("Car is returned");
	}
}
