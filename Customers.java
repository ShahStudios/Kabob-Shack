package shahkabobshack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customers {
	Scanner input = new Scanner(System.in);
	
	// Encapsulation
	private String firstName, lastName, phoneNumber, emailAddress;
	private double balance = 0;
	
	
	// constructor used for getting the first, last, name and calling the rest of the methods
	public Customers() {
		getOrder();
	}
	
	private void getOrder() {
		System.out.print(" Welcome to Shah's Kabob Shack! \n" + " Would you like to see our menu? ");
		String question1 = input.nextLine();
		
		while (!question1.equalsIgnoreCase("Yes") && !question1.equalsIgnoreCase("No")) {
		    System.out.print(" Excuse me, was that a yes or no? ");
			question1 = input.nextLine();
		}
		
		if (question1.equalsIgnoreCase("Yes")) {
			getMenu();
			getOrderDetails();
		} else if (question1.equalsIgnoreCase("No")) {
			System.out.println(" Goodbye and have a nice day!");
			System.out.print("--------------------------------------------------\n\n");
		}
		
	}
	

	private void getMenu() {
		System.out.println("---------------------[ Menu ]---------------------\n"
				+ " [ Gyros ] (Extra meat for an additional charge)\n"
				+ " Chicken Gyro $4.99+    Lamb Gyro  $4.99+\n" 
				+ "\n [ Platters ] (Extra meat for additional charge)\n"
				+ " Chicken over Rice Platter $5.99+\n Lamb over Rice Platter $5.99+\n"
				+ "\n [ Salads ] \n" + " Grilled Chicken Salad $6.99\n" 
				+ " Grilled Lamb Salad $6.99\n" + " Falafel Salad $6.99\n"
				+ "\n [ Cakes ] \n" + " Cheesecake $2.99" + "  Carrot Cake $2.99\n" + 
				" Strawberry Cheesecake $2.99" + "  Oreo Cake $2.99" +
				"\n--------------------------------------------------");
	}
	
	private void getOrderDetails() {
		
		System.out.print(" What would you like to order: ");
		String foodDetails = input.nextLine();
		
		while (!foodDetails.equalsIgnoreCase("Chicken Gyro") && !foodDetails.equalsIgnoreCase("Lamb Gyro")
				&& !foodDetails.equalsIgnoreCase("Chicken over Rice Platter") && !foodDetails.equalsIgnoreCase("Lamb over Rice Platter")
				&& !foodDetails.equalsIgnoreCase("Grilled Chicken Salad") && !foodDetails.equalsIgnoreCase("Cheesecake")
				&& !foodDetails.equalsIgnoreCase("Grilled Lamb Salad") && !foodDetails.equalsIgnoreCase("Carrot Cake")
				&& !foodDetails.equalsIgnoreCase("Falafel Salad") && !foodDetails.equalsIgnoreCase("Strawberry Cheesecake")
				&& !foodDetails.equalsIgnoreCase("Oreo Cake")) {
		    System.out.print(" Excuse me? That is not on our menu try again! ");
		    foodDetails = input.nextLine();
		} 
		
		if (foodDetails.equalsIgnoreCase("Chicken Gyro")) {
			balance = balance + 4.99;
		} else if (foodDetails.equalsIgnoreCase("Lamb Gyro")) {
			balance = balance + 4.99;
		} else if (foodDetails.equalsIgnoreCase("Chicken over Rice Gyro")) {
			balance = balance + 5.99;
		}
		else if (foodDetails.equalsIgnoreCase("Lamb over Rice Gyro")) {
			balance = balance + 5.99;
		}
		else if (foodDetails.equalsIgnoreCase("Grilled Chicken Salad")) {
			balance = balance + 6.99;
		}
		else if (foodDetails.equalsIgnoreCase("Grilled Lamb Salad")) {
			balance = balance + 6.99;
		}
		else if (foodDetails.equalsIgnoreCase("Cheesecake")) {
			balance = balance + 2.99;
		}
		else if (foodDetails.equalsIgnoreCase("Carrot Cake")) {
			balance = balance + 2.99;
		}
		else if (foodDetails.equalsIgnoreCase("Strawberry Cheesecake")) {
			balance = balance + 2.99;
		}
		else if (foodDetails.equalsIgnoreCase("Oreo Cake")) {
			balance = balance + 2.99;
		} else balance = 0;

		
		System.out.println(" Your total is: " + balance);
		System.out.print("--------------------------------------------------\n\n");

		
	}
}