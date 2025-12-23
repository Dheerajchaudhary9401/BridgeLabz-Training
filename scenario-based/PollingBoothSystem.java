import java.util.Scanner;
public class PollingBoothSystem {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int close = 0;
    int candidate1 = 0;
    int candidate2 = 0;
    int candidate3 = 0;
    while(close != -1){
      System.out.println("Welcome to the Polling Booth System");
      System.out.print("Enter your age:");
      int age = sc.nextInt();
      
      if(age<18){
        System.out.println("You are not eligible to vote.");
      }else{
        System.out.println("You are eligible to vote.");
        System.out.println("Choose your candidate (1/2/3): ");
        System.out.println("1. Candidate A\n2. Candidate B\n3. Candidate C");
        System.out.println("Enter the candidate number you want to vote for: ");
        int candidate = sc.nextInt();
        switch(candidate){
          case 1:
          System.out.println("You have voted for Candidate A.");
          candidate1++;
          break;
          case 2:
          System.out.println("You have voted for Candidate B.");
          candidate2++;
          break;
          case 3:
          System.out.println("You have voted for Candidate C.");
          candidate3++;
          break;
          default:
          System.out.println("Invalid candidate selection.");
        }

      }
      System.out.println("Current Vote Count:");
      System.out.println("Candidate A: " + candidate1 + " votes");
      System.out.println("Candidate B: " + candidate2 + " votes");
      System.out.println("Candidate C: " + candidate3 + " votes");
      System.out.print("Enter -1 to close the polling booth or any other number to continue: ");
      close = sc.nextInt();
      System.out.println("-----------------------------------");
    }
  }
}
