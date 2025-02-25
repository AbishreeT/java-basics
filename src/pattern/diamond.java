package pattern;
import java.util.*;

public class diamond {
	
	  public static void main(String[]args)
	  {
	    Scanner sc= new Scanner(System.in);
	    int num=sc.nextInt();
	    for(int row=1;row<=num;row++)
	    {
	        for (int col=row;col<=num;col++)
	           {
	               System.out.print(" "); 
	           }
	        for(int col=1;col<=row*2-1;col++)
	          {
	              System.out.print("*");
	          }
	              System.out.println(" ");
	    } 
	    for(int row1=num;row1>=1;row1--)
	    {
	        for (int col1=row1;col1<=num;col1++)
	           {
	               System.out.print(" "); 
	           }
	        for(int col2=1;col2<=2*row1-1;col2++)
	          {
	              System.out.print("*");
	          }
	              System.out.println();
	  }
	}
	}

