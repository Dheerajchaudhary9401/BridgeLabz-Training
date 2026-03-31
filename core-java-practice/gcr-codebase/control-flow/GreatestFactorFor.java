import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        // Using for loop for greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Output the result
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
