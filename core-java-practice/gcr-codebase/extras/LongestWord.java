import java.util.Scanner;
public class LongestWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String s = sc.nextLine();
    String[] arr = s.split(" ");
    int maxlen = arr[0].length();
    String word = arr[0];
    for(int i=1;i<arr.length;i++){
      if(maxlen<arr[i].length()){
        maxlen = arr[i].length();
        word = arr[i];
      }
    }
    System.out.println("Longest word: "+ word);
  }
}
