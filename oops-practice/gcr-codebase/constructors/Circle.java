import java.util.Scanner;

public class Circle {
  int radius;
  Circle(){
    this(1);
  }
  Circle(int radius){
    this.radius = radius;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    Circle circle = new Circle();
    Circle circle2 = new Circle(r);
    System.out.println(circle.radius);
    System.out.println(circle2.radius);
  }
}
