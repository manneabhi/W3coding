import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Order> orders = new ArrayList<Order>();
	public void takeOrder(Order order)
	{
		orders.add(order);
	}
	
	public void placeOrder()
	{
		for(Order order: orders ) 
		{
			order.executeOrder();
		}
		orders.clear();
	}
}
