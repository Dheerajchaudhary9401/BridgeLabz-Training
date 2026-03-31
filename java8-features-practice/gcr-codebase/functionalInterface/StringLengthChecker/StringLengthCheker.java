package functionalInterface.StringLengthChecker;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthCheker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		System.out.println("length limit is 10");
		int limit = 10;
		
		Function<String, Integer> length = s -> s.length();
		
		if(length.apply(str)>limit) {
			System.out.println("Limit Exceeded for "+str.length()+" length of string");
		}
		sc.close();

	}

}
