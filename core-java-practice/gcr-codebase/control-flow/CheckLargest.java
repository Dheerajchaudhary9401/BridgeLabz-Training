import java.util.Scanner;
public class CheckLargest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // User input for first number
        int num2 = sc.nextInt(); // Input for second number
        int num3 = sc.nextInt(); // Input for third number

        // Checking the largest among three and print the output
        if(num1<num2 && num1<num3){
            System.out.println("Is the first number the largest? Yes \nIs the second number the largest? No \nIs the third number the largest? No");
        }
        else if(num2<num1 && num2<num3){
            System.out.println("Is the first number the largest? No \nIs the second number the largest? Yes \nIs the third number the largest? No");
        }
        else{
            System.out.println("Is the first number the largest? No \nIs the second number the largest? No \nIs the third number the largest? Yes");
        }
    }
}