package co.in.java.assignments;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit to reverse");
		int reversed = 0;
		int num = sc.nextInt();
		while(num != 0)
		{
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
	}

}
  