import java.util.Scanner;
public class CoffeeCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Greeting and menu
    System.out.println("Welcome to the Coffee Counter!");
    System.out.println("______Menu______");
    System.out.println("Espresso\nAmericano\nCappuccino\nLatte\nMacchiato\nMocha\nIced Coffee\nBlack Coffee");
    int customer =1;
    while(customer==1){
      // Taking user input
      
      System.out.print("Enter the type of coffee you want: ");
      String coffeeType = sc.nextLine();
      double pricePerCup = 0.0;
      // price of each coffee type
      switch (coffeeType) {
        case "Espresso":
          pricePerCup = 150;
          System.out.println("Price per cup: INR" + pricePerCup);
          break;
        case "Americano":
          pricePerCup = 130;
          System.out.println("Price per cup: INR" + pricePerCup);
          break;
        case "Cappuccino":
          pricePerCup = 170;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Latte":
          pricePerCup = 90;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Macchiato":
          pricePerCup = 160;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Mocha":
          pricePerCup = 225;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Iced Coffee":
          pricePerCup = 130;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Turkish Coffee":
          pricePerCup = 275;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        case "Black Coffee":
          pricePerCup = 200;
          System.out.println("Price per cup: INR " + pricePerCup);
          break;
        default:
          System.out.println("Sorry, we don't have that type of coffee."); 
          return;
      }
      // Taking number of cups input
      System.out.print("Enter the number of cups you want: ");
      int numberOfCups = sc.nextInt();
      double GST = 0.18; // 18% GST
      double totalCost = pricePerCup * numberOfCups; // Calculating total cost
      totalCost += totalCost * GST; // Adding GST
      System.out.println("Total cost for " + numberOfCups + " cup(s) of " + coffeeType + " is: INR " + totalCost); //output message
      System.out.print("Do you want to place another order? (1 for Yes / 2 for No(exit)): ");
      customer = sc.nextInt();
    }
    System.out.println("Thank you for visiting the Coffee Counter!");
  }
}
