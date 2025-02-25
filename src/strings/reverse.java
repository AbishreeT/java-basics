package strings;
public class reverse {
public static void main(String[]args)
{
	String s="Abishree";
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s1+=s.charAt(i);
	}
	System.out.println(s1);
	String str="Java is an obect oriented programming language";
	String []array=str.split("");
	/*for(int i=str.length()-1;i>=0;i--)
	{
       System.out.print(str.charAt(i));
	}*/
	String []ar= {"Madam","BOB","MAM","Hello","hii"};
}
}

