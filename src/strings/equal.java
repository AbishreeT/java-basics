package strings;

import java.util.Scanner;

public class equal {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();//Hello
	String s1="hello";
	String s2=new String("hello");
	System.out.print(s.equalsIgnoreCase(s2));//true
	System.out.print(s1==s2);//FALSE
	System.out.print(s1.equals(s2));//true
	
	
}
}
