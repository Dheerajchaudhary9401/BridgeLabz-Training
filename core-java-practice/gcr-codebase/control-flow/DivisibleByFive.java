import java.util.Scanner;

public class DivisibleByFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // input number
    // check divisibility by 5
    if (n % 5 == 0) {
      System.out.print("Is the number " + n + " divisible by 5? " + "true"); // number is divisible by 5
    } else {
      System.out.print("Is the number " + n + " divisible by 5? " + "false"); // number is not divisible by 5
    }
  }
}
