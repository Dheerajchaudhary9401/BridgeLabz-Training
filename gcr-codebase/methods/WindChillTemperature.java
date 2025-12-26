import java.util.Scanner;
public class WindChillTemperature {
  public double calculateWindChill(double temperature, double windSpeed){
    double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) *  Math.pow(windSpeed, 0.16);
    return windChill;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature: ");
    int temp = sc.nextInt();
    System.out.print("Enter wind speed: ");
    int windspeed = sc.nextInt();
    WindChillTemperature obj = new WindChillTemperature();
    System.out.println("Wind Chill Temperature: "+obj.calculateWindChill(temp, windspeed));
  }
}
