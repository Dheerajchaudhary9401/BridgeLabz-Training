import java.util.Scanner;

public class CountDown {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // input number
    // print countdown from n to 1
    while (n != 0) {
      System.out.println(n);
      n--;
    }
  }
}
