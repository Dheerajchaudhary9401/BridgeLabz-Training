import java.util.Scanner;

public class LineComparisonComputation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //greetings
    System.out.println("\nwelcome to Line Comparison Computation Program\n");
    //taking co-ordinates
    System.out.println("Enter first Line co-ordinates ");
    System.out.print("x1: ");
    int x1 = sc.nextInt();
    System.out.print("y1: ");
    int y1 = sc.nextInt();
    System.out.print("x2: ");
    int x2 = sc.nextInt();
    System.out.print("y2: ");
    int y2 = sc.nextInt();
    System.out.println("\nEnter second Line co-ordinates ");
    System.out.print("x1: ");
    int p1 = sc.nextInt();
    System.out.print("y1: ");
    int q1 = sc.nextInt();
    System.out.print("x2: ");
    int p2 = sc.nextInt();
    System.out.print("y2: ");
    int q2 = sc.nextInt();


    //calculation of length of line
    Double lengthOfLine1 = Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));

    System.out.printf("Length of Line1: %.2f \n",lengthOfLine1);
    Double lengthOfLine2 = Math.sqrt((p2-p1)*(p2-p1) +(q2-q1)*(q2-q1));
    System.out.printf("Length of Line2: %.2f \n",lengthOfLine2);

    //equality of two lines 
    System.out.print("Equality: ");
    if(lengthOfLine1.equals(lengthOfLine2)){
      System.out.println("Lines are equal");
    }else{
      System.out.println("Lines are not equal");
    }


    //compare two lines
    System.out.print("Comparability: ");
    int result = lengthOfLine1.compareTo(lengthOfLine2);
    if(result>0){
      System.out.print("line1 is greater than line2");
    }else if (result>0) {
        System.out.println("line1 is lesser than line2");
    }else{
      System.out.println("lines are of same length");
    }
    sc.close();
  }
}
