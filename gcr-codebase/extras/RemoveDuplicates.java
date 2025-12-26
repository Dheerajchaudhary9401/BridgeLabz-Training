import java.util.Scanner;
class RemoveDuplicates{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(sb.indexOf(s.valueOf(ch))==-1){
        sb.append(ch);
      }
    }
    System.out.println("output: "+ sb.toString());
  }
}