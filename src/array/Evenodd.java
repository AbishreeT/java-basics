package array;

public class Evenodd {
public static void main(String[]args)
{
	int[] array= {1,2,3,4,5};
	int counteven=0;
	int countodd=0;
	for(int i=0;i<array.length;i++)
	{
		if(array[i]%2==0)
		{
			counteven=counteven+1;
		}
		if(array[i]%2!=0)
		{
			countodd=countodd+1;
	    }
	}
	System.out.println(counteven);
	System.out.println(countodd);
	}
	
}

