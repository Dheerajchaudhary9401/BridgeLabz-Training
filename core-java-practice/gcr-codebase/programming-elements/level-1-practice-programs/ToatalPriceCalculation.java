import java.util.Scanner;

public class ToatalPriceCalculation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of item: ");
    double p = sc.nextDouble();
    System.out.print("Enter the quantity of item: ");
    double q = sc.nextDouble();
    double total = p * q;
    System.out
        .println("The total purchase price is INR " + total + " if the quantity " + q + " and unit price is INR " + p);
  }
}