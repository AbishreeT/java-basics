package strings;

import java.util.Scanner;

public class lengthfun {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	//WITHLIBRARY FUNCTION
	System.out.print(s1.length());
	//WITHOUT LIBRARY FUNCTION
	int a=0;
	for(char c:s1.toCharArray())
	{
		a++;
	}
	System.out.print(a);
}
}
