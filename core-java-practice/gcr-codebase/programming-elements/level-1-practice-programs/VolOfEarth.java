public class VolOfEarth {
  public static void main(String[] args) {
    int radOfEarth = 6378;
    double radOfEarthInMiles = 6378 * 1.6;
    double vol = (4.0 / 3.0) * 3.14 * Math.pow(radOfEarth, 3);
    double volInMiles = (4.0 / 3.0) * 3.14 * Math.pow(radOfEarthInMiles, 3);
    System.out.println("The volume of Earth in cubic kilometers is " + vol + " and cubic miles is " + volInMiles);

  }
}