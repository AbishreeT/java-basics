package recursion;

public class fibnocci {
	public static int m1(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return m1(n-1)+m1(n-2);
	}
public static void main(String[]args)

	{
		int n=7;
		System.out.println(m1(n));
	}
	}


