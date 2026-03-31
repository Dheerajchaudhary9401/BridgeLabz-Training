package FactoryRobotHazardAnalyzer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws RobotSafetyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arm Precision (0.0 - 1.0):");
		double armPresicion = sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity = sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState = sc.next();
		
		RobotHazardAuditor RHA = new RobotHazardAuditor();
		double output = RHA.CalculateHazardRisk(armPresicion, workerDensity, machineryState);
		System.out.println("Robot Hazard Risk Score: "+output);
		sc.close();
	}

}
