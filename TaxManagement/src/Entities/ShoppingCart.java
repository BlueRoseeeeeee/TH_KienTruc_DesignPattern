package Entities;

import java.util.ArrayList;
import java.util.List;

import strategy.TaxStrategy;

public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		this.items= new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public double calculateTotal() {
		double sum = 0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(TaxStrategy taxStrategy) {
		double amount = calculateTotal();
		taxStrategy.TaxAmount(amount);
	}
	
	

}
