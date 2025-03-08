package strategyImpl;

import strategy.TaxStrategy;

public class VATtax implements TaxStrategy {
	private int id;

	public VATtax(int id) {
		super();
		this.id = id;
	}
	@Override
	public void TaxAmount(double amount) {
		System.out.println("VAT Tax Amount: "+amount*0.2);
		
	}

}
