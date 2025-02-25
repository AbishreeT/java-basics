package training;

public class correctsumwrongsum {
public static void main(String[]args)
{
	int[] n= {1,-3,-5,6};
	int wrongsum=0;
	int correctsum=0;
	for(int i:n)
	{
		if(i<0)
		{
			wrongsum=wrongsum+(-(i));
		}
		else
		{
			wrongsum=wrongsum+i;
		}
	}
	for(int i:n)
	{
		correctsum=correctsum+i;
	}
	System.out.println(correctsum);
	System.out.println(wrongsum);
}
}
