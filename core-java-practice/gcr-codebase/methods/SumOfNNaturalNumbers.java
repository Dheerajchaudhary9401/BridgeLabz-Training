import java.util.Scanner;
public class SumOfNNaturalNumbers {
  
  int sum(int n){
    int s=0;
    for(int i=1;i<=n;i++){
      s+=i;
    }
    return s;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    SumOfNNaturalNumbers obj = new SumOfNNaturalNumbers();
    System.out.println("Sum of "+n+" natural number: "+obj.sum(n));
    
  }
}
