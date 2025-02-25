package strings;

public class concat {
public static void main(String[]args)
{
	String s1="java";
	System.out.println(s1.length());
	String s2=s1.concat("python");
	System.out.println(s2);

	
	//ACCESSING STRING CHARACTERS
	for(int i=0;i<s2.length();i++)
	{
		System.out.println(s2.charAt(i));
	}
	
}
}
