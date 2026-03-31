package FoodDelivery;

public class Agent {
	int agentId;
	String agentName;
	boolean isFree;
	int orderNumber;
	public Agent(int agentId, String agentName) {
		this.agentId = agentId;
		this.agentName = agentName;
		isFree = true;
		
	}
}
