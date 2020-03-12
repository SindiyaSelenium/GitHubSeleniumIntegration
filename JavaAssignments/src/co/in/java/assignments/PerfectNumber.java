package co.in.java.assignments;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int number, sum=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find whether it is perfect: ");
		number = sc.nextInt();
		for(int i=1; i<number;i++)
		{
			if(number%i==0)
			{
				sum = sum+i;
			}
		}
		if(number==sum)
			System.out.println("Number is perfect.");
		else
			System.out.println("Number is not perfect");
	}

}
