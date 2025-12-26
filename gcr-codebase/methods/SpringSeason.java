import java.util.Scanner;
public class SpringSeason {
  String answer(int m,int d){
    if(m==3&&d>=20){
      return "Its a Spring Season";
    }else if(m==4&&d>=1&&d<=31){
      return "Its a Spring Season";
    }else if(m==5&&d>=1&&d<=31){
      return "Its a Spring Season";
    }else if(m==6&&d<=20){
      return "Its a Spring Season";
    }
    return "Not a Spring Season";
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Month number: ");
    int m =sc.nextInt();
    System.out.print("Enter Day number: ");
    int d =sc.nextInt();
    SpringSeason obj = new SpringSeason();
    System.out.println(obj.answer(m,d));

  }
}
