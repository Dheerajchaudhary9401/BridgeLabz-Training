package functionalInterface.UnitConversion;

import java.util.Scanner;

public class UnitConversion implements Conversions{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Km: ");
		double km = sc.nextDouble();
		System.out.println("Miles: "+Conversions.kmToMiles(km));
		System.out.println("Enter Kg: ");
		double kg = sc.nextDouble();
		System.out.println("lbs: "+Conversions.kgToLbs(kg));
		sc.close();
	}

}
