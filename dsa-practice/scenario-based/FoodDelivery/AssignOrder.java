package FoodDelivery;
import java.util.*;
public class AssignOrder {
	Queue<Order> orders = new LinkedList<>();
	List<Agent> agents = new ArrayList<>();
	
	public void addAgents(String agentName, int agentId) {
		agents.add(new Agent(agentId, agentName));
	}
	public void bookOrders(int orderNumber, String itemName, String customerName) {
		orders.offer(new Order(orderNumber, itemName, customerName));
	}
	public void assignAgent(List<Agent> agents, Queue<Order> orders) throws  NoAgentAvailableException{
		boolean isAssign = false;
		for(Agent agent: agents) {
			if(agent.isFree) {
				agent.isFree = false;
				agent.orderNumber  = orders.poll().orderNumber;
	            isAssign = true;
			}
		}
		if(!isAssign) {
			throw new NoAgentAvailableException("Sorry! no agent is free right now.");
		}
	}
	public void orderCancel(Queue<Order> orders, int orderNumber) {
		for(Order order: orders) {
			if(orderNumber == order.orderNumber) {
				order.isActive = false;
			}
		}
	}
	public void viewActiveDeliveries(List<Agent> agents) {
		System.out.println("Active order number with their agents");
		for(Agent agent:agents) {
			if(!agent.isFree) {
				System.out.println("Agent name: "+agent.agentName+" with order number: "+agent.orderNumber+" is out for delivery");
			}
		}
	}
}
