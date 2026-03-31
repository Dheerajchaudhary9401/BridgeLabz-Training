import java.util.Scanner;
public class TriangularPark {
  double rounds(double a,double b, double c){
    double p = a+b+c;
    return 5000/p;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("side 1: ");
    double side1= sc.nextInt();
    System.out.print("side 2: ");
    double side2= sc.nextInt();
    System.out.print("side 3: ");
    double side3= sc.nextInt();
    TriangularPark obj = new TriangularPark();
    System.err.println("Total rounds: "+ obj.rounds(side1,side2,side3));
  }
}
