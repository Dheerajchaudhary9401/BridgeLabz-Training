public class ProfitLoss {
  public static void main(String[] args) {
    int costPrice = 129; // Cost price of the item
    int sellingPrice = 191; // Selling price of the item
    int profit = sellingPrice - costPrice; // Calculate profit
    int profitPercentage = (profit * 100) / costPrice; // Calculate profit percentage
    System.out.println("The cost price is INR 129 and Selling Price INR 191"); // Output cost price and selling price
    System.out.println("The profit is INR " + profit + " and The profit percentage is " + profitPercentage + "%"); // Output
  }
}