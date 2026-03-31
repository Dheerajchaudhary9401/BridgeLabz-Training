import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter base of triangle: ");
    double b = sc.nextDouble();
    System.out.print("Enter height of triangle: ");
    double h = sc.nextDouble();
    double areaInCm = 0.5 * b * h;
    double areaInInches = areaInCm / 6.4516; // Convert cm² to in²
    double areainFeet = areaInInches / 144; // Convert in² to ft²
    System.out.println(
        "Your Height in cm is " + areaInCm + " while in feet is " + areainFeet + " and inches is " + areaInInches);
  }
}