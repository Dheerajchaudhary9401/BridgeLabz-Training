package searching;
import java.util.*;

public class ReverseStringUsingStringBuilder {
	public static void reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("Reversed string: "+sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		reverseString(str);
		sc.close();

	}

}
