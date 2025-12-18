public class FeeDiscount {
  public static void main(String[] args) {
    double fee = 1250000; // Original fee amount
    double discountPercent = 10; // Discount rate of 20%
    double discount = (fee / 100) * discountPercent; // Calculate discount amount
    double discountedFee = fee - discount; // Calculate discounted fee
    System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); // Output
  }
}
