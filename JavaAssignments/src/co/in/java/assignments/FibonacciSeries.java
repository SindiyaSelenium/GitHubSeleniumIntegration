package co.in.java.assignments;

public class FibonacciSeries {

    public static void main(String[] args) 
    {

    	int sum, j=0, k=1;
    	for(int i=0;i<10;i++)
    	{
    		sum = j+k;
    		j=k;
    		k=sum;
    		System.out.println(j);
    	}
    }
}