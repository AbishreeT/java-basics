package array;

import java.util.Arrays;

public class Missingelement {
public static void main(String[]args)
{
	char[]array= {1,2,3,5};
	int n=5;
	int total=(n*(n+1))/2;
	int sum=0;
	for(int newarray: array)
	{
		sum=sum+newarray;
		
	}
	int missingelement=total-sum;

	System.out.println(missingelement);
}
}
