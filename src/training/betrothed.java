package training;

public class betrothed {
	public static void main(String[]args)
	{
		int num1= 75;
		int num2=48;
		int sum1=0;
		int sum2=0;
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(int i=1;i<num2;i++)
		{
			if (num2%i==0)
			{
				sum2= sum2+i;
			}
		}
		if (sum1-1==num2&&sum2-1==num1)
		{
			System.out.println("BETROTHED");
		}
		else
		{
			System.out.print("NOT");
		}
	}
	}

