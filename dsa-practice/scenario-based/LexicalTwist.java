import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class LexicalTwist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String s1 = sc.nextLine();
		if(s1.contains(" ")) {
			System.out.println(s1+" is an invalid word");
			sc.close();
			return;
		}
		System.out.print("Enter second word: ");
		String s2 = sc.nextLine();
		
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder();
		
		if(sb1.reverse().toString().equalsIgnoreCase(s2)) {
			for(int i=0;i<s2.length();i++) {
				if("aeiouAEIOU".indexOf(s2.charAt(i))!=-1) {
					sb2.append('@');
				}else {
					sb2.append(s2.charAt(i));
				}
			}
			System.out.println(sb2);
		}else {
		StringBuilder sb3 = new StringBuilder(s1);
		sb3.append(s2);
		String upper = sb3.toString().toUpperCase();
		int vowels=0,consonants=0;
		for (int i = 0; i < upper.length(); i++) {
		    char ch = upper.charAt(i);
		    if (ch >= 'A' && ch <= 'Z') {
		        if ("AEIOU".indexOf(ch) != -1) {
		            vowels++;
		        } else {
		            consonants++;
		        }
		    }
		}
		if(vowels == consonants) {
			System.out.println("Vowels and consonants are equal");
		}
		else if(vowels>consonants) {
			int count=0;
			for(int i=0;i<upper.length();i++) {
				if("AEIOU".indexOf(upper.charAt(i))!=-1) {
					System.out.print(upper.charAt(i));
					count++;
				}
				if(count==2) break;
			}
		}else {
			int count=0;
			Set<Character> set = new HashSet<>();
			for(int i=0;i<upper.length();i++) {
				if("AEIOU".indexOf(upper.charAt(i))==-1) {
					if(!set.contains(upper.charAt(i))) {
						set.add(upper.charAt(i));
						System.out.print(upper.charAt(i));
						count++;
					}
					
				}
				if(count==2) break;
			}
		}
		}
		sc.close();
		
		
	}

}
