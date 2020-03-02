package CS175L;

import java.util.Scanner;

public class CalcMyGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of courses you would like to calculate: ");
		String numClassesST = in.nextLine();
		int numClasses = Integer.parseInt(numClassesST);
		
		double totalCredit = 0;
		double totalCreditHours = 0;
		
		double numGrade = 1;
		
		for ( int i = 1; i <= numClasses; i++) {
		
		System.out.println("Enter course information separated by commas (title, credit hours, letter grade)");
				
		String classInfo = in.nextLine();
		
		
		
		String[] arrClassInfo = classInfo.split(",");
		String courseTitle = arrClassInfo[0].trim();
		double creditHours = Double.parseDouble(arrClassInfo[1].trim());
		String letterGrade = arrClassInfo[2].trim(); 
		
		
		
		
		
		if (letterGrade.equals("A"))
			numGrade = 4.0;
		if (letterGrade.equals("A-"))
			numGrade = 3.7;
		if (letterGrade.equals("B+"))
			numGrade = 3.33;
		if (letterGrade.equals("B"))
			numGrade = 3.0;
		if (letterGrade.equals("B-"))
			numGrade = 2.70;
		if (letterGrade.equals("C+"))
			numGrade = 2.30;
		if (letterGrade.equals("C"))
			numGrade = 2.0;
		if (letterGrade.equals("C-"))
			numGrade = 1.70;
		if (letterGrade.equals("D+"))
			numGrade = 1.30;
		if (letterGrade.equals("D"))
			numGrade = 1.0;
		if (letterGrade.equals("D-"))
			numGrade = 0.7;
		
		
		totalCreditHours += creditHours;
		totalCredit += (creditHours*numGrade);
		
		
		 }
		
		
		double GPA = (totalCredit/totalCreditHours);
		
		
		System.out.println("Your GPA is: " + GPA);
		
		
		
		
		
	}

}
