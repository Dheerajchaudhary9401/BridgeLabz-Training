package collections;
import java.util.*;
public class reverseList {
	public static void reverse(List<Integer> list) {
		int start=0;
		int end = list.size()-1;
		while(start<end) {
			int temp = list.get(start);
			list.set(start,list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		for(int i=0;i<size;i++) {
			arrList.add(sc.nextInt());
		}
		reverse(arrList);
		System.out.println("Reversed ArrayList: " + arrList);

		System.out.println("Enter elements for linked list");
		for(int i=0;i<size;i++) {
			linkedList.add(sc.nextInt());
		}
		reverse(linkedList);
		System.out.println("Reversed linkedList: " + linkedList);
		sc.close();
	}
}
