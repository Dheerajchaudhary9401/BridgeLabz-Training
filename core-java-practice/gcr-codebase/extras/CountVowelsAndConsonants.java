import java.util.Scanner;
public class CountVowelsAndConsonants {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s = sc.nextLine();
    int v =0;
    int c=0;
    String str = s.toLowerCase();
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
        v++;
      }else{
        c++;
      }
    }
    System.out.println("Vowels: "+v);
    System.out.println("Consonants: "+c);
  }
}
