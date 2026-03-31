package employeeLeaveManagementSystem;

public class LeaveRequest {
	Employee emp;
	int appliedLeaves = 0;
	boolean leaveStatus;
	
	LeaveRequest(Employee emp , int appliedLeaves){
		this.emp=emp;
		this.appliedLeaves += appliedLeaves;
		this.leaveStatus=false;
	}
}
