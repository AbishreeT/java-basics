package methods;
//with out static
/*public class withoutargument {
public static void main(String[]args)
{
	withoutargument obj=new withoutargument ();
		
	int res=obj.sum();
	System.out.print(res);
}

int sum()
 {int a=10;
	int b=20;
	return a+b;
 }
}
//without static
public class withoutargument {
public static void main(String[]args)
{
	
	int res=sum();
	System.out.print(res);
}

static int sum()
 {int a=10;
	int b=20;
	return a+b;
 }
}*/

//without return type WITH STATIC
public class withoutargument {
public static void sum()
{	
	int a=10;
	int b=20;
	System.out.print(a+b);
}
public static void main(String[]args)
{
	sum();
}

 }
/*without static
public class withoutargument {
public static void main(String[]args)
{
	withoutargument obj=new withoutargument ();
		
	int res=obj.sum();
	System.out.print(res);
}

int sum()
 {int a=10;
	int b=20;
	return a+b;
 }
}*/