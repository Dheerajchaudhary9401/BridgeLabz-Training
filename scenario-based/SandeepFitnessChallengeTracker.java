import java.util.Scanner;
public class SandeepFitnessChallengeTracker{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] pushupsPerDay = new int[7];
    for(int i=0;i<7;i++){
      System.out.print("day "+(i+1)+" : pushup count: ");
      pushupsPerDay[i]=sc.nextInt();
    }
    int total = 0;
    int count = 0;
    for(int i : pushupsPerDay){
      if(i==0) continue;
      total+=i;
      count++;
    }
    System.out.println("Total push-ups: "+total);
    System.out.println("Average push-ups: "+total/count);
    sc.close();
  }
}