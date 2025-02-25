package array;

import java.util.Scanner;

public class Largestelement
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int []array=new int[n];

for(int i=0;i<array.length;i++)
{
	 array[i]=sc.nextInt();
	
}
int sum=0;
float avg=0;
for(int i=0;i<array.length;i++)
{
	sum=sum+array[i];
	
}
avg=sum/array.length;
System.out.println(sum);
System.out.printf("%.2f",avg);
}
}

