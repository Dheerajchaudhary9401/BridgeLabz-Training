import java.util.Scanner;
public class CheckSmallest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // User input for first number
        int num2 = sc.nextInt(); // Input for second number
        int num3 = sc.nextInt(); // Input for third number
        String result = "";

        // Checking the smallest or not among three 
        if(num1<num2 && num1<num3){
            result = "Yes";
        }
        else{
            result = "No";
        }

        // Output the result
        System.out.println("Is the first number the smallest? " +result);
    }
}