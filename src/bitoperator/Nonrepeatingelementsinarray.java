package bitoperator;

import java.util.Scanner;

public class Nonrepeatingelementsinarray {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []array=new int[n];
	int result=0;
	for(int i:array)
	{
		array[i]=sc.nextInt();
		System.out.print(array[i]);
		return;
	}
	for(int i:array)
	{
		result=result^i;
	}
	
	System.out.println(result);
	}
}
