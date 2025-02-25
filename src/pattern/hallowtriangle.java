package pattern;

public class hallowtriangle {
	public static void main(String[]args)
	{
		int num=5;
		
		{
			for(int row=1;row<=5;row++)
			{
				for(int col=1; col<=row;col++)
				{
					if(row==1||row==num||row==col||col==1)
					System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");

			}
			}
		}
}
