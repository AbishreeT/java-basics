package training;
//FORMATION OF DIGITS
public class formation {
	public static void main(String[]args)
	{
		int num= 456;
		int res=0;
		while(num>0)
		{    
			int d=num%10;
			num=num/10;
			res=res*10+d;
			//System.out.println(res);
		}System.out.println(res);
	}}

