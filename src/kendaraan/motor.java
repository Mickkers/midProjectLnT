package kendaraan;

import java.util.Scanner;

public class motor extends kendaraan{
	
	int helmetPrice;
	
	private Scanner scan = new Scanner(System.in);

	public motor(String type) {
		// TODO Auto-generated constructor stub
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
		System.out.print("Input wheel [2 <= Wheel <= 3]: ");
		wheel = scan.nextInt();
		System.out.print("Input type [Automatic || Manual]: ");
		vehicleType = scan.next();
		System.out.print("Input helmet amount [>=1]: ");
		typeSpecific = scan.nextInt();
		
	}
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		super.sell();
		System.out.println(name + " is standing!");
		System.out.print("Input helmet price: ");
		helmetPrice = scan.nextInt();
		System.out.println("Price: " + helmetPrice * typeSpecific);
	}
	
}
