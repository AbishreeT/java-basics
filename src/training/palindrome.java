package training;
//CHECK THE GIVEN INPUT IS PALINDROME OR NOT
public class palindrome
{
public static void main(String []args) 
{
	int num=252;
	int m=num;
	 int res=0;
	while(num>0)
	{
		int digit=num%10;
	    //num= num/10;
	    res=res*10+digit;
	    num= num/10;}
	    
	    if(m==res)
	    {
	    	System.out.println("palindrome");
	    }
	    else
	    {
	    	System.out.println("not abi");
	    }
	}
}

