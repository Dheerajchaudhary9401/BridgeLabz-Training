package functionalInterface.SmartVehicleDashboard;

public interface Vehicle {
	void displaySpeed();
	
	default void batteryPercentage(int n) {
		System.out.println("battery information is not available");
	}
}