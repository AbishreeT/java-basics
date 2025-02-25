package methods;

public class swap {
public static void main(String[]args)
{
	int a=10;
	int b=11;
	System.out.println(swap(a,b));
}
public static int swap(int a,int b)
{
	a=a+b;
	b=a-b;
	a=b-a;
	return a;
}
}
