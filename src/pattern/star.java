package pattern;

public class star {
public static void main(String[]args)
{

	int num=5;
	
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
		}
	}

// FOR RIGHT ANGLE TRIANGLR OR INCREASING TRIANGLE 
/*{
	int num=5;
	
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1; col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
		}
	}*/

	
/*FOR DECREASING TIANGLE CHANGE THE INNER FOR LOOP TO{
	
	int num=5;
	
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col<=num;col++)
			{
				System.out.print("*");
			}
			System.out.println(" ");

		}
		}
	}

}*/

// PYRAMID CONCEPT
//import java.util.*;
//public class star
//{
 // public static void main(String[]args)
  {
  //  Scanner sc= new Scanner(System.in);
    int num=5;
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
  }
}
