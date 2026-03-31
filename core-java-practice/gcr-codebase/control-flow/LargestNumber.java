import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(); // first number
    int n2 = sc.nextInt(); // second number
    int n3 = sc.nextInt(); // third number
    // determine the largest number
    if (n1 > n2 && n1 > n3) {
      System.out.println("Is the first number the largest?" + " yes\n" + "Is the second number the largest?" + " no\n"+ "Is the third number the largest?" + " no"); // first number is largest
    } else if (n2 > n1 && n2 > n3) {
      System.out.println("Is the first number the largest?" + " no\n" + "Is the second number the largest?" + " yes\n"
          + "Is the third number the largest?" + " no"); // second number is largest
    } else {
      System.out.println("Is the first number the largest?" + " no\n" + "Is the second number the largest?" + " no\n"
          + "Is the third number the largest?" + " yes"); // third number is largest
    }
  }
}
