package oopassignment;

public abstract class DessertItem {

	private String name;
	
	public DessertItem() {
		// TODO Auto-generated constructor stub
	}
	
	public DessertItem(String name) {

		this.name = name;
	}
	
	public abstract double returnCost();
	
	public final String returnName() {
		return this.name;
	}
}
