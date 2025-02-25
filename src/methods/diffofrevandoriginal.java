package methods;

public class diffofrevandoriginal {
	public static void main(String[]args)
	{
		int num=10;
		System.out.print(diff(num));
		 
	}
public static int diff(int num)
{  // int num=10;
	  int copy=num;
	int rev=0;
	while(num>0)
	{
		int d=num%10;
		rev=rev*10+d;
		num=num/10;
	}
	int diff=rev-copy;
	return diff;
}
}
