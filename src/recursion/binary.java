package recursion;

public class binary {
	public static String recursion(int n, String result)
	{
		if(n==0)
		{
			return result;
		}
		result=n%2+result;
		return recursion(n/2,result);
	}
	public static void main(String[]args)
	{
		
		int n=25;
		String result ="";
		System.out.print(recursion(n,result));
	}
	
}
