import java.util.Scanner;
public class TrigonometricFunctionsUsingMathClass {
  public double[] calculateTrigonometricFunctions(double angle){
    double r = Math.toRadians(angle);
    double sin = Math.sin(r);
    double cos = Math.cos(r);
    double tan = Math.tan(r);
    return new double[] {sin,cos,tan};
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the angle: ");
    double angle = sc.nextDouble();
    TrigonometricFunctionsUsingMathClass obj = new TrigonometricFunctionsUsingMathClass();
    double[] res = obj.calculateTrigonometricFunctions(angle);
    System.out.println("sine: "+res[0] );
    System.out.println("cosine: "+res[1] );
    System.out.println("tangent: "+res[2] );
  }
}
