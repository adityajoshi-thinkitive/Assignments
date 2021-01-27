package oopassignment;

public class Candy extends DessertItem {

	private double weight, priceperkg = 50;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(String name, double weight) {
		super(name);
		this.weight = weight;
	}
	
	@Override
	public double returnCost() {
		return (this.weight/1000)*this.priceperkg;
	}

}
