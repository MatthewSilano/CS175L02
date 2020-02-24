package homework2;

import java.util.Scanner;

public class E511H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature: ");
		double temp = sc.nextDouble();
		
		System.out.println("Celsius or Farenheit? (C or F): ");
		String type = sc.next();
		
		if ((temp > 0 && temp < 100) && (type == "C"))
			System.out.println("Water is liquid.");
		else if ((type == "C") && (temp <= 0))
			System.out.println("Water is solid");
		else if ((type == "C") && (temp >= 100))
			System.out.println("Water is gaseous");
		else if ((type == "F") && (temp > 32 && temp < 212))
			System.out.println("Water is liquid.");
		else if ((type == "F") && (temp <= 32))
			System.out.println("Water is solid");
		else
			System.out.println("Water is gaseous");
		
		
			
					
		
		

	}

}
