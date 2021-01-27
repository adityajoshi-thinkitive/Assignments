package oopassignment;

public class Checkout {
	
	private DessertItem arr[] = new DessertItem[10]; 
	private int count = 0;
	
	public void enterDersertItems(DessertItem d) {
		if(this.count < 10) {
			this.arr[this.count] = d;
			this.count++;
		}else {
			System.out.println("Can't add more items");
		}
	}
	
	public void clearCashRegister() {
		this.arr = new DessertItem[10];
		this.count = 0;
	}
	
	public int getNoofItems() {
		return this.count;
	}
	
	public double getTotalCost() {
		double totalcost = 0;
		for (int i=0;i<count;i++){

			totalcost = totalcost+ arr[i].returnCost();
//			System.out.println(arr[i].returnCost());

			}
		return totalcost;
	}
	
	public String getReceipt() {
		String r = "";
		for (int i=0;i<count;i++){

			r = r+arr[i].returnName()+" : "+arr[i].returnCost()+"\n";
		
			}
		return r;
	}
}
