package oopassignment;

public class Cookie extends DessertItem {

	private int noofunits;
	double priceperdozen = 10;
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(String name, int noofunits) {
		super(name);
		this.noofunits = noofunits;
	}
	@Override
	public double returnCost() {
		return (this.noofunits)*this.priceperdozen/12;
	}

}
