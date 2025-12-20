import java.util.Scanner;
public class CountDownUsingWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Take user input of any number
        while(num>=1){
            System.out.println(num); // Print countdown
            num = num-1;
        }
    }
}