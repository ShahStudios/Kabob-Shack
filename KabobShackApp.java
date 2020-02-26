package shahkabobshack;

import java.util.Scanner;

public class KabobShackApp {
	
	public static void main(String [] args) {
		System.out.print("--------------------------------------------------\n");
		System.out.print(" How many customers are in line: ");
		Scanner input = new Scanner(System.in);
		int numCustomers = input.nextInt();
		
				// create array for new students
				Customers [] customers = new Customers[numCustomers];
				for (int i = 0; i < numCustomers; i++) {
					System.out.print("--------------------------------------------------\n");
					customers[i] = new Customers();
				}
		
	}
}