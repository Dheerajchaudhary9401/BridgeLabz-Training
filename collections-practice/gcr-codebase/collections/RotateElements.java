package collections;
import java.util.*;
public class RotateElements {
	public static List<Integer> rotate(List<Integer> list,int n) {
		List<Integer> l = new ArrayList<>();
		for(int i=n;i<list.size();i++) {
			l.add(list.get(i));
		}
		for(int i=0;i<n;i++) {
			l.add(list.get(i));
		}
		
		return l;
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
		System.out.print("Enter number of element: ");
		int n=sc.nextInt();
		System.out.println(rotate(list,n));
		sc.close();
	}

}
