package training;
//factors find factors,sum of factors,count of factors
public class Factors {
public static void main(String[]args)
{
	int num1=8;
	int sum=0;
	int count=0;
	for(int i=1;i<=num1;i++)
	{
	if(num1%i==0)
	{
		sum=sum+i;
		count=count+1;
		System.out.println(i);
	}
	}
	//System.out.println(i);
	System.out.println(sum);
	System.out.println(count);
}
}
