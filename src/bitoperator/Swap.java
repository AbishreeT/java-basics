package bitoperator;

public class Swap {
public static void main(String[]args)
{
	int a=7;
	int b=5;
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a);
	System.out.print(b);
}
}
