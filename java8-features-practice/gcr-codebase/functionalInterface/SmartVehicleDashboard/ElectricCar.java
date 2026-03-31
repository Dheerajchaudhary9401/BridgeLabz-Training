package functionalInterface.SmartVehicleDashboard;

public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 100 km/h");
    }

    @Override
    public void batteryPercentage(int n) {
        System.out.println("Battery level: "+n);
    }
}