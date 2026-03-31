package functionalInterface.TemperatureAlertSystem;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temp: ");
		double temp = sc.nextDouble();
		
		double threshold = 40;
		Predicate<Double> Alert = t -> threshold<t;
		
		System.out.println("Temperature: "+temp);
		if(Alert.test(temp)) {
			System.out.println("Alert! Temperature is high");
		}
		sc.close();
	}

}
