import java.util.Scanner;
public class CountDownUsingFor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input for counter
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
        
        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print current counter value
        }
        System.out.println("Rocket Launched!");
    }
}