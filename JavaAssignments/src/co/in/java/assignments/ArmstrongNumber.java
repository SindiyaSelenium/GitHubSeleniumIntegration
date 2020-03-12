package co.in.java.assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find whether it is Armstrong number or not.");
        int armstrong = sc.nextInt();
        int remainder;
        int number;
        int result = 0;
        number = armstrong;
        while(number!=0)
        {
        	remainder = number%10;
        	result += Math.pow(remainder, 3);
        	number/=10; 
        }
        
        if(result==armstrong)
        System.out.println(armstrong+" number is armstrong.");
        else
        System.out.println(armstrong+" number is not armstrong.");
    }

}
