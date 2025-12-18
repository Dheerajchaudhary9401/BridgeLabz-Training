import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take two integers from user
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        // Calculate quotient and remainder
        int q = n1 / n2;
        int r = n1 % n2;
        // Output
        System.out.println("The Quotient is " + q + " and Remainder is " + r + " of two numbers " + n1 + " and " + n2);

    }

}
