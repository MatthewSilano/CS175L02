package CS175L;

import java.util.Scanner;

public class CarCostCalculationV2 {

public static void main(String[] args) {



Scanner in = new Scanner(System.in);


System.out.println("Enter the information for the regular car starting with name, cost, and mpg separated by a comma: ");
String regInfo = in.nextLine();

System.out.println("Enter the information for the hybrid car starting with name, cost, and mpg separated by a comma : ");
String hybridInfo = in.nextLine();

System.out.print("Enter the miles traveled in a year: ");
double mpy = in.nextDouble();

System.out.print("Enter the cost per gallon of gas: ");
double costGal = in.nextDouble();

//using arrays
String[] arrReginf = regInfo.split(",");
String mmReg = arrReginf[0];
int costReg = Integer.parseInt(arrReginf[1]);
int mpgReg = Integer.parseInt(arrReginf[2]);

String[] arrHybinf = hybridInfo.split(",");
String mmHyb = arrHybinf[0];
int costHyb = Integer.parseInt(arrHybinf[1]);
int mpgHyb = Integer.parseInt(arrHybinf[2]);

// math
double yearGasreg = (mpy / mpgReg) * costGal;
double yearReg = costReg + yearGasreg;
double year2Reg = yearGasreg + yearReg;
double year3Reg = yearGasreg + year2Reg;
double year4Reg = yearGasreg + year3Reg;
double year5Reg = yearGasreg + year4Reg;
double yearGashyb = (mpy / mpgHyb) * costGal;
double yearHyb = costHyb + yearGashyb;
double year2Hyb = yearGashyb + yearHyb;
double year3Hyb = yearGashyb + year2Hyb;
double year4Hyb = yearGashyb + year3Hyb;
double year5Hyb = yearGashyb + year4Hyb;


System.out.println("Cost to own after year 1 for " + mmReg + ": " + yearReg + " for " + mmHyb + ": "  + yearHyb);
System.out.println("Cost to own after year 2 for " + mmReg + ": " + year2Reg + " for " + mmHyb + ": "  + year2Hyb);
System.out.println("Cost to own after year 3 for " + mmReg + ": " + year3Reg + " for " + mmHyb + ": "  + year3Hyb);
System.out.println("Cost to own after year 4 for " + mmReg + ": " + year4Reg + " for " + mmHyb + ": "  + year4Hyb);
System.out.println("Cost to own after year 5 for " + mmReg + ": " + year5Reg + " for " + mmHyb + ": "  + year5Hyb);


if (year5Hyb < year5Reg)
{
System.out.println("The " + mmHyb + "pays back after 5 years");
}
}
}
