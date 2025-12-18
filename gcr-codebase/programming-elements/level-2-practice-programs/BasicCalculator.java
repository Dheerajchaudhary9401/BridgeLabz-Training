import java.util.Scanner;

public class BasicCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double a = input.nextDouble();
    System.out.print("Enter second number: ");
    double b = input.nextDouble();
    System.out.print("Addition : " + (a + b) + "\n" + "Subtraction : " + (a - b) + "\n" + "Multiplication : " + (a * b)
        + "\n" + "Division : " + (a / b) + "\n");
  }
}