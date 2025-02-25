package methods;

public class arithmaticopp {
public static void main(String[]args)
{
	int num=10;
	int num1=2;

	System.out.println(sum(num,num1));
	System.out.println(diff(num,num1));
	System.out.println(multi(num,num1));
	System.out.println(divide(num,num1));
	System.out.println(mod(num,num1));
}
public static int sum(int num,int num1)
{
	int sum=num1+num;
	return sum;
}
public static int diff(int num,int num1)
{
	int diff= num-num1;
	return diff;
}
public static int multi(int num,int num1)
{
	int multi= num*num1;
	return multi;
}
public static int divide(int num,int num1)
{   
	int divide= num/num1;
	return divide;
	
}
public static int mod(int num,int num1)
{
	int mod= num%num1;
	return mod;
}

}
