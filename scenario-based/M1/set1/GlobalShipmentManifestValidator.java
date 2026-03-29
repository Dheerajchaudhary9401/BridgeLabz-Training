package set1;

import java.util.Scanner;
import java.util.regex.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter.*;

public class GlobalShipmentManifestValidator {
	public static boolean validName(String s){
		if(s.matches("^SHIP-[1-9]\\d{5}$")){
			boolean boool = true;
			for(int i=s.length()-1;i>1;i--) {
				if(s.charAt(i)==s.charAt(i-1) && s.charAt(i-1)==s.charAt(i-2)) {
					boool = false;
					break;
				}
			}
			return boool;
		}else {
			return false;
		}
		
	}
	
	public static boolean validDate(String str) {
//		try {
//            DateTimeFormatter frmtr = DateTimeFormatter.ofPattern("uuuu-MM-dd").withResolverStyle(java.time.format.ResolverStyle.STRICT);
//            LocalDate date = LocalDate.parse(str, frmtr);
//            return date.getYear() >= 2000 && date.getYear() <= 2099;
//        } catch(Exception e) {
//            return false;
//        }
		int year=Integer.parseInt(str.split("-")[0]);
		if(year<2000&&year>2099)
			return false;
		try {
			LocalDate d=LocalDate.parse(str);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public static boolean validMode(String str) {
		if(str.matches("AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validWeight(String str) {
		if(!str.matches("^(0|[1-9]\\d{0,5})(\\.\\d{1,2})?$")) {
	        return false;
	    }

	    double weight = Double.parseDouble(str);
	    return weight > 0 && weight <= 999999.99;
	}
	public static boolean validStatus(String str) {
		if(str.matches("DELIVERED|CANCELLED|IN_TRANSIT")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String validator(String str) {
		String[] arr = str.split("\\|");
		if(arr.length != 5) return "NON-COMPLIANT RECORD";

        String name = arr[0];
        String date = arr[1];
        String mode = arr[2];
        String weight = arr[3];
        String status = arr[4];

        if(validName(name) &&
           validDate(date) &&
           validMode(mode) &&
           validWeight(weight) &&
           validStatus(status)) {
            return "COMPLIANT RECORD";
        }

        return "NON-COMPLIANT RECORD";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		String[] arr = new String[n];
//
//        for(int i = 0; i < n; i++) {
//            arr[i] = sc.nextLine();
//        }
//        for(int i = 0; i < n; i++) {
//            System.out.println(validator(arr[i]));
//        }
//	}
		System.out.print(validDate("2022-12-25"));
	}

}
