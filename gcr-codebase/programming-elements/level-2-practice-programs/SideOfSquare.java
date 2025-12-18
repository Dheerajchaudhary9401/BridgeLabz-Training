import java.util.Scanner;

public class SideOfSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the perimeter of square: ");
    double p = sc.nextDouble();
    double s = p / 4;
    System.out.println("Length of Side is " + s + " whos6e perimeter is " + p);
  }
}