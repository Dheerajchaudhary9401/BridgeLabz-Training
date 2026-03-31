import java.util.Scanner;
public class QuotientAndReminder {
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int q = number/divisor;
    int r = number%divisor;
    return new int[]{q,r};
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.print("Enter a divisor: ");
    int n2 = sc.nextInt();
    int[] result = findRemainderAndQuotient(n, n2);
    
    System.out.println("Quotient: " + result[0]);
    System.out.println("Remainder: " + result[1]);
    sc.close();
  }
}
