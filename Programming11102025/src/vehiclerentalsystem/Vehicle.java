package vehiclerentalsystem;

import java.util.Scanner;

public class Vehicle {
	private String vehicleid;
	private String brand;
	private Double baserate;
	
	Scanner sc=new Scanner(System.in);
	
	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getBaserate() {
		return baserate;
	}

	public void setBaserate(Double baserate) {
		this.baserate = baserate;
	}

	public void calculateRentalCost(int days) {
	
	}
	
	public void calculateRentalCost(int days,double discount) {
		
	}
	
	public void calculateRentalCost(int days, boolean includeinsurance) {
	
	}
	
	
	public void accept() {
		System.out.println();
		System.out.println();
		System.out.println("Enter Vehicle Id : ");
		setVehicleid(sc.next());
		System.out.println("Enter Brand Name : ");
		setBrand(sc.next());
		System.out.println("Enter Base Rate : ");
		setBaserate(sc.nextDouble());
	}
	
	public void display() {
		System.out.println("=====Vehicle Details=====");
		System.out.println("Vehicle ID : "+getVehicleid());
		System.out.println("Vehicle Brand Name : "+ getBrand());
		System.out.println("Vehicle Base Rate is : "+ getBaserate());
	}
}
