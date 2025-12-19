import java.util.Scanner;

public class SumOfNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // input number
    // first check n is natural number then calculate sum of natural numbers up to n
    if (n > 0) {
      int sum = n * (n + 1) / 2; // sum = n(n+1)/2
      System.out.println("Sum of " + n + " natural numbers is: " + sum);
    }
    // if n is not a natural number
    else {
      System.out.println("The number " + n + " is not a natural number");
    }
  }
}
