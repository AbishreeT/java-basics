package training;
//CHECK THE NUM IS AMPIABLE OR NOT ...
//CHECK CONDITION TO UNDERSTAND THE PROGRAM CONCEPT
public class ambicable {
public static void main(String[]args)
{
	int num1= 30;
	int num2=50;
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
	if (sum1==num2&&sum2==num1)
	{
		System.out.println("AMBICABLE");
	}
	else
	{
		System.out.print("NOT");
	}
}
}
