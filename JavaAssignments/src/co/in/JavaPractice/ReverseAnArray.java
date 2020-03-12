package co.in.JavaPractice;

import java.util.Scanner;

public class ReverseAnArray 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array: ");
		int num = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[num];
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Original Array is: ");
		for(int i=0;i<array.length-1; i++)
		{
			System.out.println(array[i]);
		}

		System.out.println("Reversed array is: ");
		for (int j=array.length-1; j>=0;j--)
		{
			System.out.println(array[j]);
		}
	}

}
