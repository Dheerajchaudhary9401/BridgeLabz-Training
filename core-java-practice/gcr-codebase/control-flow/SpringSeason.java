import java.util.Scanner;

public class SpringSeason {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt(); // input month
    int day = sc.nextInt(); // input day
    // check if the date is in spring season
    if ((month == 3 && day > 19) || (month == 6 && day < 21) || (month > 3 && month < 6)) {
      System.out.print("Its a Spring Season");
    } else {
      System.out.print("Not a Spring Season");
    }
  }
}
