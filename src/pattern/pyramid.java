package pattern;

public class pyramid {
	public static void main(String[]args)
	{
	 int num=5;
	    for(int row=0;row<=num;row++)
	    {
	        for (int col=row;col<=num;col++)
	           {
	               System.out.print(" "); 
	           }
	        for(int col=1;col<=row*2+1;col++)
	          {
	              System.out.print("*");
	           }
	              System.out.println(" ");
	    }
}}
