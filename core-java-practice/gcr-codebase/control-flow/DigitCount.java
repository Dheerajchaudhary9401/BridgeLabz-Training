import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the user input 
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        int n = Math.abs(number);
        if (n == 0){
            count = 1;
        }
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
