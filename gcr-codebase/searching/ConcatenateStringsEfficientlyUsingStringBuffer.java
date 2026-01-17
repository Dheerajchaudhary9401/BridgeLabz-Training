package searching;
import java.util.*;
public class ConcatenateStringsEfficientlyUsingStringBuffer {
	
	public static String concatenate(String[] arr) {
		StringBuffer sb = new StringBuffer();
		for(String s : arr) {
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of string array: ");
		int n = sc.nextInt();
		System.out.println("Enter strings in array");
		String[] strings = new String[n];
		for(int i=0;i<n;i++) {
			strings[i]=sc.next();
		}
		System.out.println("Final string after concatenation: "+concatenate(strings));
		sc.close();
	}
}
