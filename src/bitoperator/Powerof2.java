package bitoperator;

public class Powerof2 {
public static void main(String[]args)
{
	int n=8;
	if((n&(n-1))==0)
			{
		System.out.print(n+" is power of 2");
			}
	else
	{
		System.out.print(n+" is not power of 2");
	}
}
}
