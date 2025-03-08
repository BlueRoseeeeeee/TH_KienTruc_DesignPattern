package strategyImpl;

import strategy.TaxStrategy;

public class ConsumptionTax implements TaxStrategy {
    private int id;
	public ConsumptionTax(int id) {
		super();
		this.id = id;
	}

	@Override
	public void TaxAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Consumption Tax Amount: "+amount*0.1);
	}

}
