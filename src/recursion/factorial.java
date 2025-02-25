package recursion;

public class factorial {
public static int m1(int n)
{
	if(n==0)
	{
		return 1;
	}
	return n*m1(n-1);
	
}
public static void main(String[]args)
{
	int n=5;
	System.out.println(m1(n));
}
}
