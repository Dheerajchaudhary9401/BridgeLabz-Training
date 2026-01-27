package collections;
import java.util.*;

public class CheckTwoSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		System.out.println("Enter set1 elements");
		for(int i=0;i<size;i++) {
			set1.add(sc.nextInt());
		}
		System.out.println("Enter set2 elements");
		for(int i=0;i<size;i++) {
			set2.add(sc.nextInt());
		}
		System.out.println("Are sets equal? "+set1.equals(set2));
		sc.close();
	}

}
