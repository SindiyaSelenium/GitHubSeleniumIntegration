package co.in.java.assignments;

import java.util.Scanner;

public class SwapTwoNumbers {

	/*
	 * public static void main(String[] args) { int i,j;
	 * 
	 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter First number."); i = sc.nextInt();
	 * System.out.println("Enter Second number."); j=sc.nextInt(); int temp = i;
	 * i=j; j=temp; System.out.println("After swapping " +i+" "+j); }
	 */
	
	//SWAP TWO NUMBERS WITHOUT USING TEMP//
	
	public static void main(String[] args) {
		int i,j;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number.");
		i = sc.nextInt();
		System.out.println("Enter Second number.");
		j=sc.nextInt();
		i=j+i;
		j=i-j;
		i=i-j;
		System.out.println("After swapping " +i+" "+j);
	}

}
