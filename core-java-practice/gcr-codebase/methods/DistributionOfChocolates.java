import java.util.Scanner;
public class DistributionOfChocolates {
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int q = number/divisor;
    int r = number%divisor;
    return new int[]{q,r};
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of chocolates: ");
    int n = sc.nextInt();
    System.out.print("Enter the number of children: ");
    int m = sc.nextInt();
    int[] result = findRemainderAndQuotient(n, m);
    System.out.println("Chocolates each child get: "+ result[0]);
    System.out.println("Remaining chocolates : "+ result[1]);
  }
}
