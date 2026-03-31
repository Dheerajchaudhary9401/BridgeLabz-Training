import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class RohansLibraryReminderApp {
  public static LocalDate input(String s){
    LocalDate date = LocalDate.parse(s);
    return date;
  }
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Library Reminder App");
    int exit = 0;
    while(exit != 6){
      System.out.print("Enter return date(yyyy-MM-dd): ");
      String s = sc.next();
      LocalDate returnDate = input(s);
      System.out.print("Enter due date(yyyy-MM-dd): ");
      String s2 = sc.next();
      LocalDate dueDate = input(s2);
      if(returnDate.isBefore(dueDate)|| returnDate.isEqual(dueDate)){
        System.out.println("No fine");
      }else{
        int days = (int)ChronoUnit.DAYS.between(dueDate, returnDate);
        System.out.println("total fine: "+(days*5));
      }
      exit++;
    }
    sc.close();
  }
}