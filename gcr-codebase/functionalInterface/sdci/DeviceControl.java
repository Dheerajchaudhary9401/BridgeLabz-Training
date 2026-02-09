package functionalInterface.sdci;

public class DeviceControl {

	public static void main(String[] args) {
		Lights light = new Lights();
		AC ac = new AC();
		TV tv = new TV();
		
		light.turnOn();
		light.turnOff();
		
		ac.turnOn();
		ac.turnOff();
		
		tv.turnOn();
		tv.turnOff();

	}

}
