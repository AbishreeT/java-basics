package multidimensionalarray;

import java.util.Scanner;

public class Initialize {
public static void main(String[]args)
{ Scanner sc=new Scanner(System.in);
System.out.print("enter no of rows");
int row=sc.nextInt();
int n[][]=new int[row][];
for(int i=0;i<row;i++)
{
	System.out.print("enter no of columns");
	int col= sc.nextInt();
	n[i]=new int[col];
	for(int j=0;j<col;j++)
	{    
		n[i][j]=sc.nextInt();
	}
}
	//int n[][]= {{1,2,3},{4,5,6,7},{8,9}};
	//System.out.print(n[0][2]);


	for(int i=0;i<n.length;i++)
	{
		for(int j=0;j<n[i].length;j++)
		{   
			//System.out.print("n["+i+"]["+j+"]: "+n[i][j]+"  ");
			
			System.out.print(n[i][j]+" ");
		}
		System.out.print(" ");
	}


/*// PRINT USING FOR EACH LOOP
  for(int[] i:n)
{
	for(int j:i)
	{
		System.out.print(j);
	}
	System.out.println();
}
 */
}
}
