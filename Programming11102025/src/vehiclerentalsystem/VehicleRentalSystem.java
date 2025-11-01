package vehiclerentalsystem;

import java.util.Scanner;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vehicle car=new Car();
		Vehicle bike=new Bike();
		Vehicle truck=new Truck();
		
		int ch;
		do {
			System.out.println("====Vehicle Rental System====");
			System.out.println("Enter Choice : ");
			System.out.println("1.Car 2.Bike 3.Truck 4.Exit");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				  System.out.println("===== Enter car details =====");
				  car.accept(); 
				  car.display();
				  car.calculateRentalCost(20);
				  car.calculateRentalCost(20, false);
				  car.calculateRentalCost(20, 5);
				break;
			case 2:
				System.out.println("===== Enter Bike details =====");
				bike.accept();
				bike.display();
				bike.calculateRentalCost(20);
				bike.calculateRentalCost(20, true);
				bike.calculateRentalCost(20, 5);
				break;
			case 3: 
				System.out.println("===== Enter Truck details =====");
				truck.accept();
				truck.display();
				truck.calculateRentalCost(20);
				truck.calculateRentalCost(20, true);
				truck.calculateRentalCost(20, 5);
				break;
			case 4: System.out.println("Thank You"); break;
			default : System.out.println("Wrong Choice");
			}
		}while(ch!=4);
		
		
	}

}
