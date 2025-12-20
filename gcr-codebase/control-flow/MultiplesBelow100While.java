import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input for number
        System.out.print("Enter a positive integer less than 100 : ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = number - 1;
            System.out.println("Multiples of " + number + " below 100 :");

            // Print the multiples
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
