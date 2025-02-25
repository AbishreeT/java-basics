package strings;

public class joins {
public static void main(String[]args)
{
	String s1= " Hii";
	String join=String.join(" ",s1,s1,s1);
	System.out.println(join);
	System.out.print(String.join(" ",s1,s1,s1));
}
}
