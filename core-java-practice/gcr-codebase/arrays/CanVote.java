import java.util.Scanner;
public class CanVote {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = 10;
    int[] ages = new int[size]; // Array to store ages of 10 students
    // Input ages
    for (int i = 0; i < size; i++) {
      System.out.print("Enter age " + (i + 1) + ": ");
      ages[i] = sc.nextInt();
    }
    // Check voting eligibility
    for (int age : ages) {
      if (age >= 18) {
        System.out.println("The student with the age " + age + " can vote.");
      }else{
        System.out.println("The student with the age " + age + " cannot vote.");
      }
    }
  }
}
