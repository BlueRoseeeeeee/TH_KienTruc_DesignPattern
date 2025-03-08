package testMain;

import context.OrderContext;
import implementState.Cancelled;
import implementState.Newly;
import implementState.Processing;
import implementState.Shipped;
import state.State;

public class OrderStateMain {
	public static void main(String[] args) {
		OrderContext context= new OrderContext();
		State orderNewly= new Newly();
		context.setOrderState(orderNewly);
		context.doAction();
		
		State processing= new Processing();
		context.setOrderState(processing);
		context.doAction();
		
		State shipped= new Shipped();
		context.setOrderState(shipped);
		context.doAction();
		
		State cancelled= new Cancelled();
		context.setOrderState(cancelled);
		context.doAction();
		
	}

}
