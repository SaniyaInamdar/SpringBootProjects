package vehiclerentalsystem;

import java.util.Scanner;

public class Truck extends Vehicle {

	private int cargocapasity;
	Scanner sc=new Scanner(System.in);
	
	
	public int getCargocapasity() {
		return cargocapasity;
	}

	public void setCargocapasity(int cargocapasity) {
		this.cargocapasity = cargocapasity;
	}

	@Override
	public void calculateRentalCost(int days) {
		double cost = getBaserate() * days;
		if(getCargocapasity()>1000) {
			cost += 50 * days;
		}
	    System.out.println("Truck Rental Cost: " + cost);
	}
	
	@Override
	public void calculateRentalCost(int days,double discount) {
		double cost=getBaserate()*days;
		double finalcost=cost - (cost * discount / 100);
		System.out.println("Truck Rental Cost after Discount : "+finalcost);
	}
	
	@Override
	public void calculateRentalCost(int days, boolean includeinsurance) {
		 double cost = getBaserate() * days;
		    if (includeinsurance) {
		        cost += 15 * days;
		    }
		    else {
		    	cost = getBaserate() * days;
		    	System.out.println("Truck Rental Cost (without insurance): " + cost);
		    }
		    System.out.println("Truck Rental Cost (with insurance): " + cost);
	}
	
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter cargo capacity : ");
		setCargocapasity(sc.nextInt());
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Cargo Capacity : "+getCargocapasity());
	}
	
}
