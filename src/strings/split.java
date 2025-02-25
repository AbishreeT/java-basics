package strings;

public class split {
public static void main(String[]args)
{
	String skills="java python sql c++";
    String[]skills_arr=skills.split(" ");
    System.out.println(skills_arr.length);
    System.out.println(skills_arr[3]);
    for(String temp:skills_arr)
    {
    	System.out.print(temp+ " ");
    }
    
    
}
}
