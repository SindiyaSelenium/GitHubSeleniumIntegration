package co.in.java.assignments;

import java.util.Scanner;

public class PrimeOrNot {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find whether it is prime or not: ");
		int num;
		num = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<=num/2;i++)
		{
			if(num%i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("Number is prime.");
		else
			System.out.println("Number is NOT prime.");
		
	}

}
