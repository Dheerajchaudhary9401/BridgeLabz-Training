interface Department{
  void assignDepartment(String departmentName);
  String getDepartmentDetails();
}

abstract class Employee{
  private int employeeId;
  private  String name;
  private int baseSalary;
  public Employee(int employeeId,String name,int baseSalary){
    this.employeeId=employeeId;
    this.name = name;
    this.baseSalary=baseSalary;
  }
  public int getEmployeeId(){
    return employeeId;
  }
  public void setEmployeeId(int employeeId){
    this.employeeId=employeeId;
  }
  public String getName(){
    return name;
  }
  public void setname(String name){
    this.name=name;
  }
  public int getBaseSalary(){
    return baseSalary;
  }
  public void setBaseSalary(int baseSalary){
    this.baseSalary=baseSalary;
  }
  public abstract int calculateSalary();
  void displayDetails(){
    System.out.println("-- Employee details --");
    System.out.println("EmployId: "+employeeId);
    System.out.println("Name: "+name);
    System.out.println("Base Salary: "+baseSalary);
    System.out.println("Salary: " + calculateSalary());
  }
}

class FullTimeEmployee extends Employee implements Department{
  private String department;

  public FullTimeEmployee(int employeeId,String name, int FixedSalary) {
      super(employeeId, name, FixedSalary);
  }
  @Override
  public void assignDepartment(String departmentName){
    this.department =departmentName;
  }
  @Override
  public String getDepartmentDetails(){
    return "Department: "+department;
  }
  @Override
  public int calculateSalary(){
    return getBaseSalary();
  }
  
}


class PartTimeEmployee extends Employee implements Department{
  private int hours ;
  private int ratePerHour;
  private String department;
  public PartTimeEmployee(int employeeId,String name,int hours,int ratePerHour){
    super(employeeId,name,0);
    this.hours = hours;
    this.ratePerHour = ratePerHour;
  }
  public int getHours(){
    return hours;
  }
  public void setHours(int hours){
    this.hours = hours;
  }

  public int getRatePerHour(){
    return ratePerHour;
  }
  public void setRatePerHour(int ratePerHour){
    this.ratePerHour=ratePerHour;
  }

  @Override
  public void assignDepartment(String departmentName) {
    this.department = departmentName;
  }

  @Override
  public String getDepartmentDetails() {
    return "Department: " + department;
  }
  
  
  @Override
  public int calculateSalary(){
    return hours*ratePerHour;
  }

}
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 140, 500);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        // Polymorphic calls
        e1.displayDetails();
        System.out.println(((Department) e1).getDepartmentDetails());

        System.out.println("------------------");

        e2.displayDetails();
        System.out.println(((Department) e2).getDepartmentDetails());
    }
}