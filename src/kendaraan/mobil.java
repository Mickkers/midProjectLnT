package kendaraan;

import java.util.Scanner;

public class mobil extends kendaraan{
	
	private Scanner scan = new Scanner(System.in);
	

	public mobil(String type) {
		
		this.type = type;
		System.out.print("Input brand [>= 5]: ");
		brand = scan.next();
		System.out.print("Input Name [>= 5]: ");
		name = scan.next();
		System.out.print("Input license: ");
		chr = scan.next();
		num = scan.next();
		code = scan.next();
		license = chr + " " + num + " " + code;
		System.out.print("Input top speed [100 <= Top Speed <= 250]: ");
		topSpeed = scan.nextInt();
		System.out.print("Input gas capacity [30 <= Gas Capacity <= 60]: ");
		gasCapacity = scan.nextInt();
		System.out.print("Input wheel [4 <= Wheel <= 6]: ");
		wheel = scan.nextInt();
		System.out.print("Input type [SUV || Supercar || Minivan]: ");
		vehicleType = scan.next();
		System.out.print("Input entertainment system amount [>=1]: ");
		typeSpecific = scan.nextInt();
		
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		super.sell();
		System.out.println("Entertainment system: " + typeSpecific);
		System.out.println("Turning on entertainment system...");
		if(vehicleType.equals("Supercar")) {
			System.out.println("Boosting!");
		}
		
	}
}
