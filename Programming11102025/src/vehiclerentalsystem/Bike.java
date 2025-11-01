package vehiclerentalsystem;

import java.util.Scanner;

public class Bike extends Vehicle{
	
	private boolean hashelmet=false;
	Scanner sc=new Scanner(System.in);
	
	public boolean isHashelmet() {
		return hashelmet;
	}

	public void setHashelmet(boolean hashelmet) {
		this.hashelmet = hashelmet;
	}

	@Override
	public void calculateRentalCost(int days) {
		double baseCost = getBaserate() * days;
	    System.out.println("Bike Rental Cost: " + baseCost);
	}
	
	@Override
	public void calculateRentalCost(int days,double discount) {
		double cost=getBaserate()*days;
		if(days>=3) {
			discount=10;
		}
		double finalcost=cost - (cost * discount / 100);
		System.out.println("Bike Rental Cost after Discount : "+finalcost);
	}
	
	@Override
	public void calculateRentalCost(int days, boolean includeinsurance) {
		 double cost = getBaserate() * days;
		    if (includeinsurance) {
		        cost += 15 * days;
		    }
		    else {
		    	cost = getBaserate() * days;
		    	System.out.println("Bike Rental Cost (without insurance): " + cost);
		    }
		    System.out.println("Bike Rental Cost (with insurance): " + cost);
	}
	
	@Override
	public void accept() {
	super.accept();
	System.out.println("Enter helmet applicable or not (Y/N): ");
	setHashelmet(sc.nextBoolean());
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Has helmet : "+isHashelmet());
	}
}
