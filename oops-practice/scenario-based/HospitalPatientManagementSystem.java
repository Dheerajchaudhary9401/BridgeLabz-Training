import java.util.ArrayList;

interface Payable{
  int calculateBill();
}
abstract class Patient implements Payable{
  private int patientId;
  private String patientName;
  private int patientRoom;
  public Patient(int patientId,String patientName,int patientRoom){
    this.patientId=patientId;
    this.patientName=patientName;
    this.patientRoom=patientRoom;
  }
  public int getPatientId(){
    return patientId;
  }
  public String getPatientName(){
    return patientName;
  }
  public int getPatientRoom(){
    return patientRoom;
  }
  public abstract void displayInformation();
}

class inPatient extends Patient{
  private int noOfDays;
  private int dailyCharge;

  public inPatient(int noOfDays, int dailyCharges, int id,String name, int room) {
      super(id, name, room);
      this.noOfDays=noOfDays;
      this.dailyCharge=dailyCharges;
  }

  @Override
  public int calculateBill() {
    return noOfDays*dailyCharge;
  }
  @Override
  public void displayInformation() {
    System.out.println("Patient id: "+getPatientId()+", Patient Name: "+getPatientName()+", Room no.: "+getPatientRoom()+", bill: "+calculateBill());
  }
  
}

class outPatient extends Patient{
  private int fees;

  public outPatient(int fees, int id,String name, int room) {
      super(id, name, room);
      this.fees = fees;
  }

  @Override
  public int calculateBill() {
    return fees;
  }
  @Override
  public void displayInformation() {
    System.out.println("Patient id: "+getPatientId()+", Patient Name: "+getPatientName()+", Room no.: "+getPatientRoom()+", bill: "+calculateBill());
  }
  
}

abstract class Doctor{
  private int doctorId;
  private String doctorName;
  public Doctor(int doctorId, String doctorName){
    this.doctorId=doctorId;
    this.doctorName=doctorName;
  }
  public int getDoctorId(){
    return doctorId;
  }
  public String getDoctorName(){
    return doctorName;
  }
}
class bill{
  public static void calculateBill(Patient p) {
    System.out.println("Total bill: "+p.calculateBill());
  }
}
public class HospitalPatientManagementSystem {
  static ArrayList<Patient> patients = new ArrayList<>();

  public static void addPatient(Patient p){
    patients.add(p);
  }

  public static void showPatient(){
    for(Patient p: patients){
      p.displayInformation();
    }
  }

  public static void deletePatient(int id) {
    for (int i = 0; i < patients.size(); i++) {
      if (patients.get(i).getPatientId() == id) {
        patients.remove(i);
        break;
      }
    }
  }

  public static void main(String[] args) {
    Patient p1 = new inPatient(10, 500, 215, "Dheeraj", 140);
    Patient p2 = new inPatient(8, 500, 216, "Rajat", 142);
    Patient p3 = new outPatient(5000, 230, "gc", 120);
    addPatient(p1);
    addPatient(p2);
    addPatient(p3);

    showPatient();

    deletePatient(216);
    System.out.println("After deletion");

    showPatient();
  }
}
