package co.in.JavaPractice;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args)
	{
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to be reversed: ");
		str = sc.next();
		char string[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(string[i]);
		}
	}

}
