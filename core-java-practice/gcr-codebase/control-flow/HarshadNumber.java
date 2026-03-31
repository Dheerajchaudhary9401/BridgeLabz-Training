import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of a number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int n = Math.abs(number);
        int temp = n;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Print the result
        if (sum != 0 && n % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}
