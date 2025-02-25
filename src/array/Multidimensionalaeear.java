package array;
import java.util.Scanner;
public class Multidimensionalaeear {
public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int array[][]=new int[n][m];
		
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=0;j<array.length;j++)
			{
				{
					array[i][j]=sc.nextInt();
					
			    }
			}
		}
		
				for(int i=0;i<array.length;i++)
				{
					for(int j=0;j<array.length;j++)
					      { 
				System.out.print(array[i][j]+"  ");
			               }
				}
	}
}
