import java.util.Scanner;

public class DiscountInFee {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double fee = sc.nextInt(); // Original fee amount
    double discountPercent = sc.nextDouble(); // Discount rate of 20%
    double discount = (fee / 100) * discountPercent; // Calculate discount amount
    double discountedFee = fee - discount; // Calculate discounted fee
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); // Output
  }
}
