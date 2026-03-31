import java.util.Scanner;
public class IllegalArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // This will abruptly stop the program due to exception
        // Comment this line if you want to test the handled method directly
        generateException(input);
        // This will handle the exception properly
        handleException(input);
    }
    // This method will generate a runtime exception
    static void generateException(String text) {
        // start index is greater than end index → exception
        String result = text.substring(5, 2);
        System.out.println(result); // this line will never execute
    }
    // This method handles IllegalArgumentException and RuntimeException
    static void handleException(String text) {
        try {
            String result = text.substring(6, 3);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
}