import java.util.Scanner;
public class PalindromeStringCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter ");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(int i=s.length()-1;i>=0;i--){
      sb.append(s.charAt(i));
    }

    String s2 = sb.toString();
    s = s.toLowerCase();
    s2 = s2.toLowerCase();
    System.out.println("Is Palindrome?");
    if(s.equals(s2)){
      System.out.print("true");
    }else{
      System.out.println("false");
    }
  }
}
