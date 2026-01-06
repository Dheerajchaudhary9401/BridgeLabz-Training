import java.util.Scanner;
public class CafeteriaMenuApp {
  public static void displayMenu(String[] m){
    for(int i=0;i<m.length;i++){
      System.out.println((i+1)+". "+m[i]);
    }
  }
  public static String getItem(String[] menu,int n){
    return menu[n-1];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Campus Cafeteria");
    String[] menu = {"Coffee","Tea","Sandwich","Burger","Pizza","Pasta","French Fries","Salad","Juice","Ice Cream"};
    displayMenu(menu);
    System.out.print("Enter the item number: ");
    int n = sc.nextInt();
    System.out.println("your item: "+getItem(menu,n));
    sc.close();
  }
}
