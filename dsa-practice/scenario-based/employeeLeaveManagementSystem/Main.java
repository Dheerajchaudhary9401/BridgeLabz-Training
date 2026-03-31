package employeeLeaveManagementSystem;

public class Main {
	public static void main(String[] args) {
		EmployeeLeaveManagement el = new EmployeeLeaveManagement();
		try {
			el.applyLeave(el.emp1, 10);
			el.applyLeave(el.emp2, 15);
			el.applyLeave(el.emp3, 18);
			el.applyLeave(el.emp4, 20);
			el.applyLeave(el.emp1, 18);
			
		} catch(InsufficientLeaveBalanceException e) {
			System.out.println(e.getMessage());
		}
		el.displayAcceptedLeaves();
	}
}
