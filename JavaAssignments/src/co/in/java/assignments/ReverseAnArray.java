package co.in.java.assignments;

import java.util.Scanner;

public class ReverseAnArray {

	/*
	 * public static void main(String[] args) { int array[] =new int[] {2,3,4,1,5};
	 * System.out.println("Original array: "); for(int i=0;i<=array.length-1;i++) {
	 * System.out.println(array[i]); }
	 * 
	 * System.out.println("Reversed Array: "); for(int j=array.length-1;j>=0;j--) {
	 * System.out.println(array[j]); }
	 * 
	 * }
	 */
	
	//REVERSE AN ARRAY BY ACCEPTING NUMBERS AT RUNTIME
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for an array: ");
		int num = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int array[] = new int[num];
		for(int n = 0; n < num; n++)
		{
			array[n] = sc.nextInt();
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
