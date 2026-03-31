package collections;
import java.util.*;
public class Frequency {

	public static Map<String,Integer> freq(List<String> list){
		Map<String,Integer> map = new HashMap<>();
		for(String s:list) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.print("Size: ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter string elements");
		for(int i=0;i<size;i++) {
			list.add(sc.nextLine());
		}
		System.out.print(freq(list));
		sc.close();
	}

}
