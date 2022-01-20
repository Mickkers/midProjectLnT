package kendaraan;

public abstract class kendaraan {
	
	String type;
	String brand;
	String name;
	String chr;
	String num;
	String code;
	String license;
	String vehicleType;
	int topSpeed;
	int gasCapacity;
	int wheel;
	int typeSpecific;
	
	public void check() {
		System.out.println(type);
		System.out.println(brand);
		System.out.println(name);
		System.out.println(license);
		System.out.println(topSpeed);
		System.out.println(gasCapacity);
		System.out.println(wheel);
		System.out.println(vehicleType);
		System.out.println(typeSpecific);
	}
	
	public void list() {
		System.out.print(type);
		int x = type.length();
		
		for(int i = 0; i < 15 - x; i++) {
			System.out.print(" ");
		}
		System.out.print("|" + name);
		x = name.length();
		for(int i = 0; i < 15 - x; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
		System.out.println("|-----|---------------|---------------|");
	}
	
	public void sell() {
		
		System.out.println("Brand: " + brand);
		System.out.println("Name: " + name);
		System.out.println("License Plate: " + license);
		System.out.println("Type: " + type);
		System.out.println("Gas Capacity: " + gasCapacity);
		System.out.println("Top Speed: " + topSpeed);
		System.out.println("Wheels: " + wheel);
		
	}
	
}
