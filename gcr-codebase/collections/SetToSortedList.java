package collections;
import java.util.*;
public class SetToSortedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		System.out.println("Enter set elements");
		for(int i=0;i<size;i++) {
			set.add(sc.nextInt());
		}
		Set<Integer> treeSet = new TreeSet<>(set);
		ArrayList<Integer> arrayList = new ArrayList<>(treeSet);
		System.out.println("Sorted arrayList: "+arrayList);
		sc.close();
	}

}
