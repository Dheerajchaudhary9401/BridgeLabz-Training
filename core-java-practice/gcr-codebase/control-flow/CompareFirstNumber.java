import java.util.Scanner;

public class CompareFirstNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(); // first number
    int n2 = sc.nextInt(); // second number
    int n3 = sc.nextInt(); // third number
    if (n1 < n2 && n1 < n3) { // first number is smallest
      System.out.println("Is the first number the smallest?" + " yes"); // first number is smallest
    } else { // first number is not smallest
      System.out.println("Is the first number the smallest?" + " no"); // first number is not smallest
    }
  }
}
