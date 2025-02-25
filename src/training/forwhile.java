package training;

import java.util.Scanner;

//print the even numbers till 10
/*
public class Day3 
{
public static void main(String[]args)
{
	for(int i=0; i<=10; i=i+1)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		
	}
}
}*/


/*write the program to print the months of the year using switch condition
import java.util.Scanner;
public class Day3
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	int month= sc.nextInt();
	switch (month)
	{
	case 1:
		System.out.println("jan");
		break;
	case 2:
		System.out.println("feb");
		break;
		default:
			System.out.println("invalid");
	}
	
	}
}*/

/*print sum of natural numbers till n
import java.util.Scanner;
public class Day3
{
	public static void main(String[]args)
	{   Scanner sc= new Scanner(System.in);
	    int num = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i=i+1)
		{
			sum=sum+i;
			System.out.println(sum);	
		}
	}
}*/

/*same program using while loop to print sum
import java.util.Scanner;
public class forwhile
{
	public static void main(String[]args)
	{   
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		 
		int i=1;
		while(i<=num)
		{  
			sum=sum+i;
			System.out.println(sum);
		    i++;
		}
		
	}
}*/


//print the sum of n natural even numbers

/*public class forwhile
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num)
		{
			if(i%2==0) 
				sum=sum+i;
			System.out.println(sum);
			i++;
		}
      }
	}
*/

/*given 2 integer inputs and find the multi of given input without using multi operator
public class forwhile
{
	public static void main(String[]args)
	{
		int num1=5;
		int num2=2;
		int sum=0;
		for(int i=1;i<=num2;i++)
		{
		    sum=sum+num1;
		}
			System.out.println(sum);
		
		
	}
}*/


/*2 input given find the quotient with out using the division operator
public class forwhile
{
	public static void main(String[]args)
	{
		int num1=8;
		int num2=2;
		int q=0;
		for(int i=1;num1>=num2;q++)
		{
			num1=num1-num2;
		
		}
		System.out.println(q);
	}
}*/


/*given the range of input  terminate the multiplication of 4 values using of contineous statements
public class forwhile
{
	public static void main(String[]args)
	{
		for(int i=1;i<=15;i++)
		{
			if(i%4==0)
				continue;
			System.out.println(i);
		}
	
	}
}*/

