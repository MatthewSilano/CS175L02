package homework2;

import java.util.Scanner;

public class E510H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter employee name: ");
		 String name = sc.next();
		 System.out.println("Enter hourly wage: ");
		 double wage = sc.nextDouble();
		 System.out.println("Enter number of hours worked in past week: ");
		 double hours = sc.nextDouble();
		 System.out.println("Enter number of hours worked overtime (hours past 40): ");
		 double overtime = sc.nextDouble();
		 
		 double pay = wage*hours;
		 double overpay = ((overtime*hours)/5);
		 double totalpay = pay+overpay;
		 
		 System.out.println("Paycheck for " + name + " amounts to " + totalpay);
		 
		 
		 

	}

}
