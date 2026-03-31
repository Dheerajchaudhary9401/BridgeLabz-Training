import java.util.Scanner;
public class SimpleInterest{
  double simpleIntr(int p,int r, int t){
    double si = (p*r*t)/100;
    return si;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Princpal: ");
    int Principal = sc.nextInt();
    System.out.print("Rate: ");
    int Rate = sc.nextInt();
    System.out.print("Time: ");
    int Time = sc.nextInt();
    SimpleInterest obj = new SimpleInterest();
    System.out.print("Simple Interest: "+obj.simpleIntr(Principal,Rate,Time));
  }
}