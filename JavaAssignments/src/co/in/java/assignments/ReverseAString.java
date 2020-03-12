package co.in.java.assignments;

import java.util.Scanner;

public class ReverseAString 
{
	  public static void main(String[] args) 
	  {
	  
	  String str;
	  
	  @SuppressWarnings("resource") 
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the string"); 
	  str = sc.nextLine(); 
	  char[] rev = str.toCharArray(); 
	  for(int i=rev.length-1;i>=0;i--)
	   {
		  System.out.print(rev[i]);
	   }
	  
	  }
	 
	
	/*
	 * public static void main(String[] args) 
	 * { 
	 * String str;
	 * 
	 * @SuppressWarnings("resource") 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter the string"); 
	 * str = sc.nextLine(); 
	 * String[] rev =
	 * str.split(""); 
	 * for(int i=rev.length-1;i>=0;i--) 
	 * { 
	 *	 System.out.print(rev[i]); 
	 * }
	 * 
	 * }
	 */
}
