package vehiclerentalsystem;

import java.util.Scanner;

public class Car extends Vehicle {
    private int numofseats;
    Scanner sc = new Scanner(System.in);

    public int getNumofseats() {
        return numofseats;
    }

    public void setNumofseats(int numofseats) {
        this.numofseats = numofseats;
    }

    @Override
    public void calculateRentalCost(int days) {
        double baseCost = getBaserate() * days;
        if (getNumofseats() >= 5) {
            baseCost += days * 20;
            System.out.println("Car Rental Cost (Number of seats >= 5): " + baseCost);
        } else {
            System.out.println("Car Rental Cost (Number of seats < 5): " + baseCost);
        }
    }

    @Override
    public void calculateRentalCost(int days, double discount) {
        double cost = getBaserate() * days;
        double finalcost = cost - (cost * discount / 100);
        System.out.println("Car Rental Cost after Discount: " + finalcost);
    }

    @Override
    public void calculateRentalCost(int days, boolean includeinsurance) {
        double cost = getBaserate() * days;
        if (includeinsurance) {
            cost += 15 * days;
            System.out.println("Car Rental Cost (with insurance): " + cost);
        } else {
            System.out.println("Car Rental Cost (without insurance): " + cost);
        }
    }

    @Override
    public void accept() {
        super.accept();
        System.out.print("Enter Number of seats: ");
        setNumofseats(sc.nextInt());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of seats: " + getNumofseats());
    }
}
