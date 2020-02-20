package CS175L;

import java.util.Scanner;

public class GroceryDiscountV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		boolean go = true;
		
		while (go) {
		
		System.out.println("Enter the cost of your groceries or 0 to end the program: ");
		double totalcost = sc.nextDouble();
		
		if (totalcost == 0)
			go = false;
		else
			go = true; 
		
		double couponvalue;
		int percent;
		
		if (totalcost < 10)
			couponvalue = 0;
		else if (totalcost >= 10 && totalcost <= 60)
			couponvalue = 0.08*totalcost;
		else if (totalcost > 60 && totalcost < 150)
			couponvalue = 0.10*totalcost;
		else if (totalcost >= 150 && totalcost <= 210)
			couponvalue = 0.12*totalcost;
		else couponvalue = 0.14*totalcost;
		
		
		if (totalcost < 10)
			percent = 0;
		else if (totalcost >= 10 && totalcost <= 60)
			percent = 8;
		else if (totalcost > 60 && totalcost < 150)
			percent = 10;
		else if (totalcost >= 150 && totalcost <= 210)
			percent = 12;
		else percent = 14;
		
		
		if (totalcost <10 && totalcost >0)
			System.out.println("Coupons are given to purchases over 10$ only.");
		else if (totalcost >1000)
			System.out.println("Purchases over $1000 are not valid.");
		else if (totalcost >0)
			System.out.println("You get a coupon worth $" + couponvalue + (" (" + percent + "% of your purchase.)"));
		else; 
		}
		
		
		
	}

}
