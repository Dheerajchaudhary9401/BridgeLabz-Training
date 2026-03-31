public class PenDistribution {
  public static void main(String[] args) {
    int p = 14; // Total number of pens
    int s = 3; // Number of students
    int studentHaveP = p / s; // Calculate pens per student
    int remainingP = p % s; // Calculate remaining pens
    System.out.println("The Pen Per Student is " + studentHaveP + " and the remaining pen not distributed is " + remainingP);
  }
}
