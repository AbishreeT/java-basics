package training;

import java.util.Scanner;

public class maxandmin {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		if (num<num2)
		{
			System.out.println("NUM 2 IS MAX");
		}
		else
		{
			System.out.println("NUM IS MAX");
		}
	}

}
