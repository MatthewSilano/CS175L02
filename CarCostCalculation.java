package CS175L;

import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Cost of regular car: ");
		double regularCarCost = in.nextDouble();
		
		System.out.print("Enter Miles per gallon of regular car: ");
		double mpgRegular = in.nextDouble();
		
		System.out.print("Enter Cost of hybrid car: ");
		double hybridCarCost = in.nextDouble();
		
		System.out.print("Enter Miles per gallon of hybrid car: ");
		double mpgHybrid = in.nextDouble();
		
		System.out.print("Enter miles traveled in a year: ");
		double milesTraveled = in.nextDouble();
		
		System.out.print("Enter cost per gallon of gas: ");
		double gasCost = in.nextDouble();
		
		//math time
		
		double regularGasCostPerYear = ((milesTraveled/mpgRegular)*gasCost);
		
		double hybridGasCostPerYear = ((milesTraveled/mpgHybrid)*gasCost);
		
		//
		
		double regYear1 = (regularGasCostPerYear+regularCarCost);
		double regYear2 = (regularGasCostPerYear+regYear1);
		double regYear3 = (regularGasCostPerYear+regYear2);
		double regYear4 = (regularGasCostPerYear+regYear3);
		double regYear5 = (regularGasCostPerYear+regYear4);
		
		double hybridYear1 = (hybridGasCostPerYear+hybridCarCost);
		double hybridYear2 = (hybridGasCostPerYear+hybridYear1);
		double hybridYear3 = (hybridGasCostPerYear+hybridYear2);
		double hybridYear4 = (hybridGasCostPerYear+hybridYear3);
		double hybridYear5 = (hybridGasCostPerYear+hybridYear4);
		
		System.out.print("Cost to own after year 1 for regular car: " + regYear1);
		System.out.println(" for hybrid car: " + hybridYear1);
		System.out.print("Cost to own after year 2 for regular car: " + regYear2);
		System.out.println(" for hybrid car: " + hybridYear2);
		System.out.print("Cost to own after year 3 for regular car: " + regYear3);
		System.out.println(" for hybrid car: " + hybridYear3);
		System.out.print("Cost to own after year 4 for regular car: " + regYear4);
		System.out.println(" for hybrid car: " + hybridYear4);
		System.out.print("Cost to own after year 5 for regular car: " + regYear5);
		System.out.println(" for hybrid car: " + hybridYear5);
		
		System.out.println("The hybrid car pays back after 5 years.");
		
	}

}
