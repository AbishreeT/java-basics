package strings;

public class passwordvalid {
public static void main (String []args)
{
	String s1="Hello#8hr";
	System.out.print("validpassword?"+pass(s1));
}
	public static boolean pass(String s1)
	{
	boolean upper=false,lower=false,space=false,digit=false,splchar=false;
	if(s1.length()<8)
	{
		return false;
	}
	else
	{
		for(int i=0;i>s1.length();i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
					{
				upper=true;
					}
			else if(Character.isLowerCase(s1.charAt(i)))
			{
				lower=true;
			}
			else if(Character.isDigit(s1.charAt(i)))
			{
				digit=true;
			}
			else if(Character.isWhitespace(s1.charAt(i)))
			{
				space=true;
			}
			else if(isSpecialchar(s1.charAt(i)))
			{
				splchar=true;
			}
			
				
		}
	}
	return upper&& lower&&!space&&digit&&splchar;
	}
	private static boolean isSpecialchar(char c)
	{
	String special="!@#$%^&*()_+";
	if(special.indexOf(c)!=-1)
		return true;
	else
		return false;
		
	}
	
}

