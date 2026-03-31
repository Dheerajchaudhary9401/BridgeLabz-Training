import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        // Get input values
        System.out.print("Enter value for a (double): ");
        a = sc.nextDouble();
        System.out.print("Enter value for b (double): ");
        b = sc.nextDouble();
        System.out.print("Enter value for c (double): ");
        c = sc.nextDouble();
        // Perform operations with proper precedence
        double r1 = a + b * c; // Multiplication first
        double r2 = a * b + c; // Multiplication then addition
        double r3 = c + a / b; // Division then addition
        double r4 = a % b + c; // Modulus then addition
        // Output results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + r1);
        System.out.println("a * b + c = " + r2);
        System.out.println("c + a / b = " + r3);
        System.out.println("a % b + c = " + r4);
    }
}
