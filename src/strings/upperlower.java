package strings;

public class upperlower {
public static void main(String[]args)
{
	String str="Hello World";
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	int count=0;
	char []ch=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		if(ch[i] >='A'&& ch[i]<='Z')
		{
			count=count+1;
			
		}
	}
	System.out.print(count);
}
}
