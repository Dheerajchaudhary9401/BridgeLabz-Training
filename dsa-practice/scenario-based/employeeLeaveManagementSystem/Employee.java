package employeeLeaveManagementSystem;

public class Employee {
	String employeeId;
	String employeeName;
	int totalLeavesAllowed;
	
	Employee(String employeeId , String employeeName , int totalLeavesAllowed){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.totalLeavesAllowed=totalLeavesAllowed;
	}
}
