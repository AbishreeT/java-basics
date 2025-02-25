package training;

public class triperfect
{
	public static void main(String[]args)
	{
		int num=8;
		int sum= 0;
		for (int i=1;i<=num;i++)
		{
			
				if(num%i==0)
				{
					sum=sum+i;
				}
			
		}
				if(sum==num*3)
				{
					System.out.print("triperfect");
				}
				else
				{
					System.out.print("NOT");
				}
			}
		}
	
