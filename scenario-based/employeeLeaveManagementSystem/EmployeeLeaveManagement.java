package employeeLeaveManagementSystem;

import java.util.*;

public class EmployeeLeaveManagement {
	Map<String, Employee> employees = new HashMap<>();
	List<LeaveRequest> leaves = new ArrayList<>();

	Employee emp1 = new Employee("1", "Dheeraj", 24);
	Employee emp2 = new Employee("2", "Vikash", 24);
	Employee emp3 = new Employee("3", "Subhash", 24);
	Employee emp4 = new Employee("4", "Shaurya", 24);

	EmployeeLeaveManagement() {
		employees.put(emp1.employeeId, emp1);
		employees.put(emp2.employeeId, emp2);
		employees.put(emp3.employeeId, emp3);
		employees.put(emp4.employeeId, emp4);
	}

	void applyLeave(Employee emp, int leaveApplied) throws InsufficientLeaveBalanceException {
		if (emp.totalLeavesAllowed - leaveApplied >= 0) {
			emp.totalLeavesAllowed -= leaveApplied;
			LeaveRequest l = new LeaveRequest(emp, leaveApplied);
			l.leaveStatus = true;
			leaves.add(l);
		} else {
			throw new InsufficientLeaveBalanceException("Insufficient Leave Balance of employee " + emp.employeeId
					+ " he had " + emp.totalLeavesAllowed + " leaves but he applied for " + leaveApplied + " leaves");
		}
	}

	void displayAcceptedLeaves() {
		System.out.println("Below are the employees id who's leaves are accepted ");
		for (LeaveRequest l : leaves) {
			System.out.println(
					l.emp.employeeId + " " + l.emp.employeeName + " , Total Leaves remaining " + l.emp.totalLeavesAllowed);

		}
	}
}
