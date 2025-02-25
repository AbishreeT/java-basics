package bitoperator;

public class Add {
public static void main(String[]args)
{
	int a=10;
	int b=10;
	while(b!=0)
	{
		int c= a&b;//for subtration// ~a&b;
		System.out.println("c:"+c);
		a=a^b;
		System.out.println("a:"+a);
		b=c<<1;
		System.out.println("b:"+b);
	}
	System.out.print("output"+a);
}
}
