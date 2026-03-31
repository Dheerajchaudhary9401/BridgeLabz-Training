import java.util.Scanner;

public class ConversionOfKmToMiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double km = sc.nextDouble(); // Distance in kilometers
    double miles = km * 0.6; // Convert to miles
    System.out.println(" The total miles is " + miles + " mile for the given " + km + " km"); // Output
  }
}
