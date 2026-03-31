package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subsets {

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
		if(set1.containsAll(set2) || set2.containsAll(set1)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		sc.close();
	}

}
