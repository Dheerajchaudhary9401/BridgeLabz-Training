import java.util.Scanner;
public class LengthOfString {
    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            // Infinite loop to access characters
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();
        // Calling user-defined method
        int customLength = findLength(input);
        // Calling built-in length() method
        int builtInLength = input.length();
        // Display results
        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
