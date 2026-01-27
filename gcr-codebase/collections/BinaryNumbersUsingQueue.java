package collections;
import java.util.*;
public class BinaryNumbersUsingQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		Queue<String> q = new LinkedList<>();
		int n=sc.nextInt();
		q.add("1");
		for(int i=0;i<n;i++) {
			String current = q.remove();
			System.out.print(current+" ");
			q.add(current+"0");
			q.add(current+"1");
		}
		sc.close();
	}

}
