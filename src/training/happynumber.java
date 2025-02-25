package training;

public class happynumber {
public static void main(String[]args)
{
	int n=2;
	int sqrt=0;
	while(n>0)
	{
		int d=n%10;
		sqrt=d*d;
		n/=10;
		
	}
	if(sqrt==1||sqrt==7)
	{
		System.out.print("happy number");
	}
	else
	{
		System.out.print("not happy");
	}
}
}
