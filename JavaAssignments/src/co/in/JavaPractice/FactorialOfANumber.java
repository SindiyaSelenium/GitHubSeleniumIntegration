package co.in.JavaPractice;

import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the factorial: ");
		int num = sc.nextInt();
		int prod = 1;
		for(int i=1;i<=num;i++)
		{
			prod = prod*i;
		}
		System.out.println(prod);

	}

}
