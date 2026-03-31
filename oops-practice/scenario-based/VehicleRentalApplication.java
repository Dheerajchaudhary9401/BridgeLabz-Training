import java.util.ArrayList;
interface Rentable{
  int calculateRent(int days);
}
//vehicle -parent class
abstract class Vehicle implements Rentable{
  protected int id;
  protected String brand;
  protected int rentPerDay;

  public Vehicle(int id, String brand, int rentPerDay){
    this.id=id;
    this.brand=brand;
    this.rentPerDay=rentPerDay;
  }
  
  public int getVehicleId(){
    return id;
  }

  public String getVehicleName(){
    return brand;
  }

  public abstract void display();

}
//bike 
class Bike extends Vehicle{
  public Bike(int id,String brand,int rentPerDay){
    super(id, brand, rentPerDay);
  }
  @Override
  public int calculateRent(int days){
    return days * rentPerDay;
  }
  @Override
  public void display(){
    System.out.println(" Bike -> Id: "+id+" , Brand: "+brand+" , Rent per day: "+rentPerDay);
  }
}
//car
class Car extends Vehicle{
  public Car(int id,String brand,int rentPerDay){
    super(id, brand, rentPerDay);
  }
  @Override
  public int calculateRent(int days){
    return (days * rentPerDay) +1000;
  }
  @Override
  public void display(){
    System.out.println(" Car -> Id: "+id+" , Brand: "+brand+" , Rent per day: "+rentPerDay);
  }
}
//truck
class Truck extends Vehicle{
  public Truck(int id,String brand,int rentPerDay){
    super(id,brand,rentPerDay);
  }
  @Override
  public int calculateRent(int days){
    return (rentPerDay*days) +2000 ;
  }
  @Override
  public void display(){
    System.out.println(" Truck -> Id: "+id+" , Brand: "+brand+" , Rent per day: "+rentPerDay);
  }
}
//customer
class Customer{
  private int customerId;
  private String CustomerName;
  public Customer(int customerId,String CustomerName){
    this.customerId=customerId;
    this.CustomerName=CustomerName;
  }
  public void display(){
    System.out.println(" Customer Id: "+customerId+" , Customer name: "+CustomerName);
  }
}

public class VehicleRentalApplication {
  static ArrayList<Vehicle> vehicles = new ArrayList<>();
  //ADD Vehicles
  public static void addVehicle(Vehicle v){
    vehicles.add(v);
  }
  //DISPLAY
  public static void displayVehicle(){
    for(Vehicle v: vehicles){
      v.display();
    }
  }
  //UPDATE
  public static void updateRent(int id, int newRent) {
    for (Vehicle v : vehicles) {
      if (v.id == id) {
        v.rentPerDay = newRent;
        System.out.println("Rent updated");
        return;
      }
    }
    System.out.println("Vehicle not found");
  }
  // DELETE
    public static void deleteVehicle(int id) {
        vehicles.removeIf(v -> v.id == id);
        System.out.println("Vehicle deleted");
    }

  public static void main(String[] args) {
    Vehicle car1 = new Car(11,"BMW",2000);
    Vehicle car2 = new Car(12,"Audi",2000);
    Vehicle bike = new Bike(01,"Yamaha",1500);
    Vehicle truck = new Truck(21, "TATA", 5000);

    Customer c1 = new Customer(1, "Sandeep Chahar");
    Customer c2 = new Customer(2, "Aman Chahar");
    addVehicle(car1);
    addVehicle(bike);
    addVehicle(truck);
    addVehicle(car2);

    displayVehicle();

    updateRent(12, 1800);
    displayVehicle();

    System.out.println("----Rented Car Details----");
    System.out.println("*Rented for 12 days costs "+ car1.calculateRent(12));
    c1.display();
    car1.display();
    System.out.println("*Rented for 10 days costs "+ car2.calculateRent(12));
    c2.display();
    car2.display();
  }
}
