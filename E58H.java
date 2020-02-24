package homework2;

import java.util.Scanner;

public class E58H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert four numbers and I will check if there are two matching pairs of numbers.");
		
		System.out.println("n1 = ");
		int n1 = sc.nextInt();
		System.out.println("n2 = ");
		int n2 = sc.nextInt();
		System.out.println("n3 = ");
		int n3 = sc.nextInt();
		System.out.println("n4 = ");
		int n4 = sc.nextInt();
		
		if ((n1 == n2 && n3==n4) || (n1==n3 && n2==n4) || (n1==n4 && n2==n3))
			System.out.println("Two pairs");
		else
			System.out.println("Not two pairs");

	}

}
