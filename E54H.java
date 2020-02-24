package homework2;

import java.util.Scanner;

public class E54H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = in.nextInt();
		
		System.out.print("Enter a second number: ");
		int n2 = in.nextInt();
		
		System.out.print("Enter a third number: ");
		int n3 = in.nextInt();
		
		
		if (n1 == n2 && n2 == n3 && n1 ==n3)
			System.out.print("All the same");
		else if (n1 == n2 || n2 == n3 || n3==n1)
			System.out.print("Neither");
		else
			System.out.print("All different");

	}

}
