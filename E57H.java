package homework2;

import java.util.Scanner;

public class E57H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert three numbers and I will check their order.");
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("n1 = ");
		n1 = sc.nextInt();
		System.out.println("n2 = ");
		n2 = sc.nextInt();
		System.out.println("n3 = ");
		n3 = sc.nextInt();
		
		if ( (n1 < n2) && (n2 < n3))
			System.out.println("In order");
		else if ((n1 > n2) && (n2 > n3))
			System.out.println("In order");
		else
			System.out.println("Not in order");

	}

}
