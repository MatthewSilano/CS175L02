package CS175L;

import java.util.Scanner;

public class HouseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the width of the house: "); 
		int houseWidth = in.nextInt();
		
		System.out.print("Enter the length of the house: "); 
		int houseLength = in.nextInt();
		
		System.out.print("Enter the height of the house: "); 
		int houseHeight = in.nextInt();
		
		System.out.print("Enter the number of sides you'd like painted: "); //sides
		int numberSides = in.nextInt();
		
		System.out.print("Enter the number of sides that have a peak that you'd like painted: "); //peaksides
		int numberPeakSides = in.nextInt();
		
		System.out.print("Enter the number of windows present on the sides you'd like painted: "); //windows
		int numberWindows = in.nextInt();
		
		System.out.print("Enter the width of the widnows, assuming each window has the same length: "); //windowWidth
		int windowWidth = in.nextInt();
		
		System.out.print("Enter the length of the widnows, assuming each window has the same length: "); //windowLength
		int windowLength = in.nextInt();
		
		System.out.print("Enter the number of doors present on the sides you'd like painted: "); //doors
		int numberDoors = in.nextInt();
		
		System.out.print("Enter the width of the doors, assuming each door has the same length: "); //doorWidth
		int doorWidth = in.nextInt();
		
		System.out.print("Enter the length of the doors, assuming each door has the same length: "); //doorLength
		int doorLength = in.nextInt();
		
		System.out.print("Enter the cost that the painter charges per square foot: "); //cost
		int painterCost = in.nextInt();
		
		//math time now
		
		int sideDimensions = (houseWidth*houseLength);
		
		int totalSides = (sideDimensions*numberSides);
		
		int peakSideDimensions = (houseWidth*houseLength*houseHeight);
		
		int totalPeakSides = (numberPeakSides*peakSideDimensions);
		
		int sumSides = (totalSides + totalPeakSides); //sides
		
		int windowDimensions = (windowWidth*windowLength);
		
		int totalWindows = (windowDimensions*numberWindows);
		
		int doorDimensions = (doorWidth*doorLength);
		
		int totalDoors = (doorDimensions*numberDoors);
		
		int totalPaintedArea = (sumSides - totalWindows - totalDoors);
		
		int totalCost = (totalPaintedArea/painterCost);
				
		System.out.print(totalCost);
		
		
	}

}
