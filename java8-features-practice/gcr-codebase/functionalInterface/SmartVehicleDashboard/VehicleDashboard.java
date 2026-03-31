package functionalInterface.SmartVehicleDashboard;

public class VehicleDashboard {

	public static void main(String[] args) {
		Vehicle car = new Car();
        
        Vehicle ev = new ElectricCar();

        car.displaySpeed();
        car.batteryPercentage(45);

        ev.displaySpeed();
        ev.batteryPercentage(65);

	}

}
