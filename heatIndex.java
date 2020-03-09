package CS175L;

import java.util.Scanner;

public class heatIndex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double T = 0;
		
		System.out.printf("     ");
		for (T = 80; T<=110;T+=2) 
		{
			System.out.printf("%5.0f",T);
		}
		System.out.println();
		System.out.println("_____________________________________________________________________________________");
		
		
		
		for (double RH = 40; RH <= 100; RH+=5)
		{
			System.out.printf("%2.0f | ",RH);
			for (T = 80; T<=110;T+=2)  
			{ 
				System.out.printf("%5.0f",(-42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - 
						.05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH));
			}
			System.out.println();  
			
		}	
		
		
		
		System.out.println("Enter a temperature: ");
		double temp = in.nextDouble();
		
		System.out.println("Enter a humidity: ");
		double humid = in.nextDouble();
		
		double feel = ((42.379 + 2.04901523*temp + 10.14333127*humid - .22475541*T*humid - .00683783*temp*temp - 
		.05481717*humid*humid + .00122874*temp*temp*humid + .00085282*temp*humid*humid - .00000199*temp*temp*humid*humid));
		
		System.out.println("The THI for a temperature of " + temp + " and a relative humidity of " + humid + " is: " + feel);
		
		
		if (feel < 90)
			System.out.println("");
		else if (feel >= 90 && feel <105)
			System.out.println("Advisory: Caution");
		else if (feel >=105 && feel <126)
			System.out.println("Advisory: Extreme Caution");
		else if (feel >=126)
			System.out.println("Advisory: Danger");
		
		
		
		
	}								
	
	
	

}


