package strings;

public class FORLOOP {
public static void main(String[]args)
{
	String str= "Hello world";
	
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.charAt(i));
	}
	
	
	char []ch=str.toCharArray();
	for(char c: ch)
	{
		System.out.println(c);
	}
}
}
