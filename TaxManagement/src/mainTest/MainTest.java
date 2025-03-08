package mainTest;

import Entities.Item;
import Entities.ShoppingCart;
import strategyImpl.ConsumptionTax;
import strategyImpl.SpecialTax;
import strategyImpl.VATtax;

public class MainTest {
	public static void main(String[] args) {
		ShoppingCart cart= new ShoppingCart();
		 
		Item i1= new Item("LT01", "Laptop Dell A68", 15000);
		cart.addItem(i1);
		cart.pay(new VATtax(01));
		
		Item i2= new Item("SC", "SunCream Aqua", 25000);
		cart.addItem(i2);
		cart.pay(new SpecialTax(02));
		
		Item i3= new Item("HD01", "Máy lạnh Panasonic", 18000);
		cart.addItem(i3);
		cart.pay(new ConsumptionTax(03));
	}

}
