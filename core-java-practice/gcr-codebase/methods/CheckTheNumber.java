import java.util.Scanner;
public class CheckTheNumber {
  String check(int n){
    if(n>0){
      return "Number is Positive";
    }
    else if (n==0) {
        return "Number is zero";
    }
    return "Number is Negative";
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    CheckTheNumber obj = new CheckTheNumber();
    System.out.print(obj.check(n));
    sc.close();
  }
}
