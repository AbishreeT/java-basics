package array;

import java.util.Scanner;

public class AsscendindBubblesort {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]array=new int[n];
	for(int i=0;i<n;i++)
	{
		array[i]=sc.nextInt();
	}
	int ass=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(array[i]>array[j])
			{
				ass=array[i];
				array[i]=array[j];
				array[j]=ass;
				
			}
		}

	System.out.print(array[i]);
	}
	
}
}
