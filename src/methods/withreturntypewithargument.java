package methods;

public class withreturntypewithargument {
public static void main(String[]args)
{
	int num=8;
	int r=count( num);
	System.out.println(r);
}
public static int count(int num)
{   
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		count=count+1;
		}
	}
	return count;
}
}
