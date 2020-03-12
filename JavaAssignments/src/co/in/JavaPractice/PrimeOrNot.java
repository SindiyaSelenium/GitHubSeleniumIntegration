package co.in.JavaPractice;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find whether it is Prime or Not: ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("The number is Prime");
		else
			System.out.println("Number is not Prime");
	}
	
}
