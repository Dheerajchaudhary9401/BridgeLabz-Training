package functionalInterface.sdci;

public class AC implements Control{
	@Override
	public void turnOn() {
		System.out.println("AC is turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("AC is turned off");
	};
}
