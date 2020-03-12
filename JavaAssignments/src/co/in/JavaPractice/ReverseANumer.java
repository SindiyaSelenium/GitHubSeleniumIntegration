package co.in.JavaPractice;

import java.util.Scanner;

public class ReverseANumer 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two digit number to be reversed");
		int num = sc.nextInt();
		int reverse = 0;
		while(num!=0)
		{
			int number =num%10;
			reverse = reverse*10+number;
			num/=10;
		}
		System.out.println(reverse);
		
	}

}
