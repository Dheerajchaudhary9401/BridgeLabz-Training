import java.util.Scanner;
public class ToggleCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = sc.nextLine();
    StringBuilder sb =new StringBuilder();
    for(int i=0;i<s.length();i++){
      if(Character.isUpperCase(s.charAt(i))){
        sb.append(Character.toLowerCase(s.charAt(i)));
      }else{
        sb.append(Character.toUpperCase(s.charAt(i)));
      }
    }
    System.out.println("Output: "+ sb.toString());
  }
}
