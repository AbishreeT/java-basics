package methods;

public class methodwithifelse {
static void vote(int age,String name)
{
	if(age<18)
	{
		System.out.println("not");
	}
	else
	{
		System.out.println("vote");
	}
}
public static void main(String[]args)
{
	vote(12,"abi");
	vote(19,"mamtha");
}
}
