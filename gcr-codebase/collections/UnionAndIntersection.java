package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionAndIntersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		System.out.print("Enter Size: ");
		int size1 = sc.nextInt();
		System.out.println("Enter set1 elements");
		for(int i=0;i<size1;i++) {
			set1.add(sc.nextInt());
		}
		System.out.print("Enter Size: ");
		int size2 = sc.nextInt();
		System.out.println("Enter set2 elements");
		for(int i=0;i<size2;i++) {
			set2.add(sc.nextInt());
		}
		Set<Integer> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		Set<Integer> intersectionSet = new HashSet<>(set1);
		intersectionSet.retainAll(set2);

//		for (int i : set2) {
//		    union.add(i);
//		}
//		for (int i : set1) {
//		    if (set2.contains(i)) {
//		        intersection.add(i);
//		    }
//		}

		System.out.println("union: "+unionSet);
		System.out.println("intersection: "+intersectionSet);
		sc.close();
	}

}
