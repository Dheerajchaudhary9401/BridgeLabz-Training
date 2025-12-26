import java.util.Scanner;
public class SubstringOccurrance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String str = sc.nextLine();
    System.out.print("Enter a subString: ");
    String subStr = sc.nextLine();
    int count=0;
    for (int i = 0; i <= str.length() - subStr.length(); i++) {
      if (str.substring(i, i + subStr.length()).equals(subStr)) {
        count++;
      }
    }
    System.out.println("occurrences: "+count);
  }
}
