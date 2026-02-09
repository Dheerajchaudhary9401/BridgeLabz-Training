package functionalInterface.MultiVehicleRentalSystem;

public class MultiVehicleRental {

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Bus bus = new Bus();
		
		car.rent();
		car.returnVehicle();
		
		bike.rent();
		bike.returnVehicle();
		
		bus.rent();
		bus.returnVehicle();

	}

}
