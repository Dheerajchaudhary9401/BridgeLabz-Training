import java.util.Scanner;

public class MaxNUmberOfHandshakes {
  int combination(int n){
    int c = (n*(n-1))/2;
    return c;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of Students: ");
    int n = sc.nextInt();
    MaxNUmberOfHandshakes maxHandshakes = new MaxNUmberOfHandshakes();
    System.out.println("Maximum number of Handshakes: "+ maxHandshakes.combination(n));
  }
}
