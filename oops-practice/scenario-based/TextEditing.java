import java.util.Scanner;
public class TextEditing {
  public static String format(String s){
    StringBuilder sb = new StringBuilder();
    boolean nextCap = false;
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      sb.append(ch);
      if(",.!?".indexOf(ch)!= -1){
        if(s.charAt(i+1)!=' '){
          sb.append(' ');
        }
        nextCap = true;
      }else if(nextCap && Character.isLetter(ch)){
        sb.setCharAt(sb.length()-1, Character.toUpperCase(ch));
        nextCap = false;
      }
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a paragraph ");
    String s = sc.nextLine();
    System.out.println(format(s));
    sc.close();
  }
}
