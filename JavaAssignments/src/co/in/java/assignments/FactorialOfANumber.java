package co.in.java.assignments;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the Factorial: ");
		int num = sc.nextInt();
		int product = 1;
		for(int i=1;i<=num;i++)
		{
			product = product*i;	
		}
		
		System.out.println("Factorial of a number is: "+product);
	}

}
