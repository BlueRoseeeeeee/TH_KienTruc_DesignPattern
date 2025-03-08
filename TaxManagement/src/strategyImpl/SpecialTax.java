package strategyImpl;

import strategy.TaxStrategy;

public class SpecialTax implements TaxStrategy {
	private int id;
	

	public SpecialTax(int id) {
		super();
		this.id = id;
	}


	@Override
	public void TaxAmount(double amount) {
		System.out.println("Special Tax Amount: "+amount*0.3);
		
	}
	

}
