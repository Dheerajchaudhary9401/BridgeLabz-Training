import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Using while loop for greatest factor
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Output the results
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
