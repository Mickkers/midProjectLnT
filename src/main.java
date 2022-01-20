import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import kendaraan.*;

public class main {

	private static Scanner scan;
	public static ArrayList<mobil> listMobil = new ArrayList<mobil>();
	public static ArrayList<motor> listMotor = new ArrayList<motor>();
	
	private static void listView() {
		int x = 1;
		scan = new Scanner(System.in);

		System.out.println("|-----|---------------|---------------|");
		System.out.println("|No   |Type           |Name           |");
		System.out.println("|-----|---------------|---------------|");
		
		for(mobil m: listMobil) {
			
			System.out.format("|%-5d|", x);
			m.list();
			x++;
			
		}
		
		for(motor m: listMotor) {
			
			System.out.format("|%-5d|", x);
			m.list();
			x++;
			
		}
		
		System.out.println("|-----|---------------|---------------|");
		
		System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
		int choice = scan.nextInt();
		
		if(choice == 0) {
			programStart();
			return;
		} else {
			if(choice > listMobil.size()) {
				listMotor.get(choice - listMobil.size() - 1).sell();
			} else {
				listMobil.get(choice - 1).sell();
			}
		}
		
		System.out.println("ENTER to return");
		try {
			System.in.read();
		} catch (IOException e) {
			
		}
		programStart();
		return;
	}
	
	private static void inputView() {
		
		scan = new Scanner(System.in);
		System.out.print("Input Type [Car || Motorcycle]: ");
		String str = scan.next();
		
		if(str.equals("Car")) {
			mobil temp = new mobil(str);
			
			listMobil.add(temp);
			
		} else if(str.equals("Motorcycle")) {
			// TODO 
			motor temp = new motor(str);
			
			listMotor.add(temp);
			
		} else {
			
			System.out.println("Invalid input. Try again.");
			inputView();
			
		}
		
		System.out.println("ENTER to return");
		try {
			System.in.read();
		} catch (IOException e) {
			
		}
		programStart();
		return;
		
	}
	
	public static void programStart() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Choose view:");
		System.out.println("1. Input");
		System.out.println("2. List");
		System.out.println("Enter 0 to exit program.");
		
		int input = scan.nextInt();
		
		if(input == 1) {
			inputView();
		} else if(input == 2) {
			listView();
		} else if (input == 0) {
			return;
		} else {
			System.out.println("Invalid input. Try again.");
			programStart();
			return;
		}
		return;
	}
	
	
	public static void main(String[] args) {
		
		programStart();
		
		System.out.println("End Of Program");
		
	}
	
}
