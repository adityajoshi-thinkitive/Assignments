package oopassignment;

public class TestCheckout {

	public static void main(String[] args) {
		
		Checkout ch = new Checkout();
		
		Candy c = new Candy("eclaire", 200);
		Cookie ck = new Cookie("Oreo", 5);
		IceCream i = new IceCream("Vanilla",200);
		Sundae s = new Sundae("Chocolate", 250);
		
		ch.enterDersertItems(c);
		ch.enterDersertItems(ck);
		ch.enterDersertItems(i);
		ch.enterDersertItems(s);
		
		System.out.println("No of Items : "+ch.getNoofItems());
		System.out.println("Total Cost : "+ch.getTotalCost());
		System.out.println("Receipt : \n"+ch.getReceipt());
		
		ch.clearCashRegister();
		
		System.out.println("No of Items : "+ch.getNoofItems());
		System.out.println("Total Cost : "+ch.getTotalCost());
		System.out.println("Receipt : \n"+ch.getReceipt());
	}
}
