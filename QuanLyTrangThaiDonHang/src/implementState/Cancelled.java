package implementState;

import state.State;

public class Cancelled implements State{

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		System.out.println("Hủy đơn hàng và hoàn tiền");
		
	}
	

}
