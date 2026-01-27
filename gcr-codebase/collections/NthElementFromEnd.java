package collections;
import java.util.*;

public class NthElementFromEnd {
	public static int findNthEl(LinkedList<Integer> list,int n) {
		Iterator<Integer> fast = list.iterator();
		Iterator<Integer> slow = list.iterator();
		for(int i=0;i<n;i++) {
			if(!fast.hasNext()) {
				return -1;
			}
			fast.next();
		}
		while(fast.hasNext()) {
			fast.next();
			slow.next();
		}
		return slow.next();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.print("enter index from last: ");
		int n = sc.nextInt();
		findNthEl(list,n);

		System.out.print("Nth Element from End: "+findNthEl(list,n));
		sc.close();
	}

}
