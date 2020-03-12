package co.in.java.assignments;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the Factorial: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;	
		}
		
		System.out.println("Factorial of a number is: "+fact);
	}

}
