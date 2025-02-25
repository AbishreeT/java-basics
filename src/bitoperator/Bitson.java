package bitoperator;

public class Bitson 
{
public static void main(String[]args)
{
	int n=10;
	int count=0;
while(n>0)
	{
	n=n&(n-1);
		count+=1;
	}
	System.out.print(count);
}
}
