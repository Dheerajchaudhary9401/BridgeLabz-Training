import java.util.ArrayList;
import java.util.Scanner;
public class FlightBookingSystem {
  //Array for available flight data
  static String[][] flights ={{"F101", "Delhi", "Mumbai", "06:30", "5500"},{"F102", "Mumbai", "Bangalore", "09:45", "6200"},{"F103", "Chennai", "Delhi", "14:15", "7000"},{"F104", "Kolkata", "Hyderabad", "18:00", "5800"},{"F105", "Pune", "Goa", "20:30", "4200"},{"F106", "Delhi", "Chandigarh", "07:15", "3200"},{"F107", "Mumbai", "Delhi", "10:30", "5600"},{"F108", "Bangalore", "Chennai", "12:00", "2800"},{"F109", "Hyderabad", "Pune", "15:45", "3600"},{"F110", "Goa", "Mumbai", "17:20", "4100"},{"F111", "Delhi", "Jaipur", "08:00", "2500"},{"F112", "Kolkata", "Delhi", "11:10", "6000"},{"F113", "Ahmedabad", "Mumbai", "13:35", "3400"},{"F114", "Indore", "Delhi", "16:50", "3900"},{"F115", "Bangalore", "Hyderabad", "19:05", "3300"},{"F116", "Chennai", "Coimbatore", "06:45", "2200"},{"F117", "Lucknow", "Delhi", "09:25", "3100"},{"F118", "Patna", "Kolkata", "14:40", "2600"},{"F119", "Jaipur", "Mumbai", "18:30", "4800"},{"F120", "Delhi", "Goa", "21:15", "6500"}};

  static void searchFlight(String source,String destination){
    boolean found =false;
    for(String[] flight : flights){
      if(flight[1].equalsIgnoreCase(source)&&flight[2].equalsIgnoreCase(destination)){
        System.out.println("flight: "+flight[0]+", Time: "+flight[3]+", price: "+flight[4]);
        found=true;
      }
    }
    if(!found){
      System.out.println("-No flights available-");
    }
  }

  static ArrayList<String> list =new ArrayList<>();
  static void book(String flightId,String customerName){
    for(String[] flight: flights){
      if(flightId.equals(flight[0])){
        String l = "Name: "+customerName+", flight: "+flightId+", "+flight[1]+" -> "+flight[2]+", Time: "+flight[3]+", "+flight[4];
        
        list.add(l);
        System.out.println("Flight booked succesfully");
        return;
      }
    }
    System.out.println("Sorry, Invalid flight Id");
  }
  static void viewBooking(){
    if(list.isEmpty()){
      System.out.println("No booking record");
      return;
    }
    for(String l : list){
      System.out.println(l);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--Flight Booking System--");
    while(true){
      System.out.println("\n1. Search Flight \n2. Book Flight \n3. View Booking Details \n4. Exit");
      System.out.print("Enter your choice: ");
      int n = sc.nextInt();
      System.out.println();
      switch(n){
        case 1:
        System.out.print("Enter source: ");
        String s1 = sc.next();
        System.out.print("Enter destination: ");
        String s2 = sc.next();
        searchFlight(s1, s2);
        break;
        case 2:
        System.out.print("Enter flight id: ");
        String s3 = sc.next();
        System.out.print("Enter your name: ");
        String s4 = sc.next();
        book(s3, s4);
        break;
        case 3:
        viewBooking();
        break;
        case 4:
        return;
        default:
        System.out.println("invalid choice");
      }
    }
  }
}
