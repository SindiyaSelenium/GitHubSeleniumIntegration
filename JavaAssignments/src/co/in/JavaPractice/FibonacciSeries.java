package co.in.JavaPractice;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int i=0,j=1, sum;
		for(int n=1; n<=10; n++)
		{
			sum=i+j;
			i=j;
			j=sum;
			
			System.out.println(j);
		}
		
	}

}
