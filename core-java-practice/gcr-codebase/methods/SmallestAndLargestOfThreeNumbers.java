import java.util.Scanner;
public class SmallestAndLargestOfThreeNumbers {
  void solution(int a,int b,int c){
    int largest = Math.max(a, Math.max(b, c));
    int smallest = Math.min(a, Math.min(b, c));
    System.out.println("Smallest number : "+smallest);
    System.out.println("Largest number : "+largest);
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int n2 = sc.nextInt();
    System.out.print("Enter third number: ");
    int n3 = sc.nextInt();
    SmallestAndLargestOfThreeNumbers obj = new SmallestAndLargestOfThreeNumbers();
    obj.solution(n1,n2,n3);
    sc.close();
  }
}
