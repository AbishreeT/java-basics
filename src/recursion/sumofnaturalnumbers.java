package recursion;

public class sumofnaturalnumbers {
	public static int m1(int n)
	{
	    if(n==0)
		{
			return n;
		}
		int ans =n+m1(n-1);
		System.out.print(ans+" ");
		return ans;
	}
	public static void main(String[]args)
	{
		int a=10;
		m1(a); //System.out.println(m1(a))
	}
	}


