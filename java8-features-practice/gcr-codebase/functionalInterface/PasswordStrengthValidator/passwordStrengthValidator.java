package functionalInterface.PasswordStrengthValidator;

import java.util.Scanner;

public class passwordStrengthValidator implements SecurityUtils {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password: ");
		String s = sc.nextLine();
		
		if(SecurityUtils.strength(s)) {
			System.out.println("password in strong");
		}else {
			System.out.println("password is weak");
		}
		sc.close();

	}

}
