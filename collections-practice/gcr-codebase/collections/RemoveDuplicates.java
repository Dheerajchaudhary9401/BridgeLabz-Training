package collections;
import java.util.*;
public class RemoveDuplicates {
	public static List<Integer> rmDuplicates(List<Integer> list){
		List<Integer> al = new ArrayList<>();
		for(int i : list) {
			if(!al.contains(i)) {
				al.add(i);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(rmDuplicates(list));
		sc.close();
	}

}
