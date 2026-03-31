package review;
import java.util.Scanner;
public class FlipKey {
	public static String CleanseAndInvert(String input) {
		if(input.length()<7 || input==null) {
			return "Invalid Input";
		}
		for(int i=0;i<input.length();i++) {
			if(!Character.isLetter(input.charAt(i))) {
				return "Invalid Input";
			}
		}
		String s = input.toLowerCase();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(input);
		for(int i=0;i<s.length();i++) {
			int ascii = (int) s.charAt(i);
			if(ascii%2==0) {
				sb.append(s.charAt(i));
			}
		}
		sb.reverse();
		StringBuilder sb2 = new StringBuilder();
		String s2=sb1.reverse().toString().toLowerCase();
		for(int i=0;i<s2.length();i++) {
			if(i%2==0) {
			sb2.append(Character.toUpperCase(s2.charAt(i)));
			}else {
				sb2.append(s2.charAt(i));
			}
		}
		
		return sb2.toString();
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Word: ");
		String input = sc.nextLine();
		//CleanseAndInvert(input);
		System.out.println("The generated key is - "+CleanseAndInvert(input));
		sc.close();
	}

}
