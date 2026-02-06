package FoodDelivery;
public class Main {

	public static void main(String[] args) {
		AssignOrder assign = new AssignOrder();
		assign.addAgents("Rajat langda(slow delivery)", 1);
		assign.addAgents("Vikash the brutal", 2);
		assign.addAgents("Dheeraj the destroyer", 3);
		assign.addAgents("Subhash the shooter", 4);
		assign.addAgents("Shaurya the sniper", 5);

	
		assign.bookOrders(1, "pasta", "nikky");
		assign.bookOrders(2, "maggie", "sandeep");
		assign.bookOrders(3, "panner", "anuj");
		assign.bookOrders(4, "pasta", "gc");
		assign.bookOrders(5, "pasta", "nikky");
		assign.bookOrders(6, "panner tikka", "anuj");
	
		try {
		assign.assignAgent(assign.agents, assign.orders);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		assign.viewActiveDeliveries(assign.agents);
	}

}
