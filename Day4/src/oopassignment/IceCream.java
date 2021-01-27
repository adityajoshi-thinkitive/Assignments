package oopassignment;

public class IceCream extends DessertItem {
	
	private double cost;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(String name, double cost) {
		super(name);
		this.cost = cost;
	}

	@Override
	public double returnCost() {
		return this.cost;
	}

}
