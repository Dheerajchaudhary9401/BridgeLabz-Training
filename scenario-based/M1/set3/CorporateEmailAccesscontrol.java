package set3;

import java.util.Scanner;

public class CorporateEmailAccesscontrol {
	static void validate(String s) {
		if(s.matches("^[a-z]{3,}\\.[a-z]{3,}[0-9]{4,}\\@(sales|marketing|IT|product)\\.(company)\\.(com)$")) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Access Denied");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			validate(s);
		}
		sc.close();
	}

}
