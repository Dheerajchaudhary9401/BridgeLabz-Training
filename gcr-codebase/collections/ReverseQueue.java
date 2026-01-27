package collections;
import java.util.*;
public class ReverseQueue {
	public static void reverse(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}
		int first = q.poll();
		reverse(q);
		q.add(first);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		System.out.print("Size: ");
		int size=sc.nextInt();
		System.out.println("Enter element");
		for(int i=0;i<size;i++) {
			q.add(sc.nextInt());
		}
		reverse(q);
		System.out.println(q);
		sc.close();
	}

}
