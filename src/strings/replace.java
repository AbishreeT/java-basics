package strings;

public class replace {
public static void main(String[]args)
{
	String s1="hii";
	System.out.println(s1.replace("i", "k"));//hkk
	System.out.println(s1.replaceAll("hii", "k"));//k
	System.out.println(s1.replaceFirst("i", "k"));//hki
	
}
}
