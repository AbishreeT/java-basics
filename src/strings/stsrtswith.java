package strings;

public class stsrtswith {
public static void main(String[]args)
{
	String s="java is an object oriented programming";
	
   System.out.println(s.startsWith("e"));
   
   String[]array=s.split("p");
   System.out.println(array[1]);
   for(String s1:array)
   {
	  
	   System.out.println(s1);
   }
	
}
}
