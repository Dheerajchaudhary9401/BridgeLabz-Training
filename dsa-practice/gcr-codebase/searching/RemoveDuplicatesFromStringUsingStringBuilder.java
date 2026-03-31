package searching;
import java.util.*;
public class RemoveDuplicatesFromStringUsingStringBuilder {
	
	public static String removeDuplicates(String str) {
		HashSet<Character> charset = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			
			if(!charset.contains(str.charAt(i))) {
				sb.append(str.charAt(i));
				charset.add(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("New String: "+removeDuplicates(str));
		sc.close();
	}
}
