import java.util.Scanner;
public class Factors {
  public static int[] fact(int n){
    int count=0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        count++;
      }
    }
    int[] factorArray = new int[count];
    int j =0;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        factorArray[j++]=i;
      }
    }
    return factorArray;
  }
  int sumOfFactors(int[] arr){
    int sum =0;
    for(int i=1;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  int productOfFactors(int[] arr){
    int p =1;
    for(int i=1;i<arr.length;i++){
      p*=arr[i];
    }
    return p;
  }
  int sumOfSquaresOfFactors(int[] arr){
    int sum =0;
    for(int i=1;i<arr.length;i++){
      sum+=arr[i]*arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    Factors obj = new Factors();
    int[] arr = fact(n);
    System.out.print("factors: ");
    for(int f : arr){
      System.out.print(f+" ");
    }
    
    System.out.println("\nsum: "+ obj.sumOfFactors(fact(n)));
    System.out.println("product: "+ obj.productOfFactors(fact(n)));
    System.out.println("sum of squares of factors: "+obj.sumOfSquaresOfFactors(fact(n)));

  }
}
