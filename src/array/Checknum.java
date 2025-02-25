package array;

public class Checknum 
{
    public static void main(String[]args)
  {
     int[] array= {1,3,4,5,6};	
     int key=4;
     boolean found = false;
     for(int num:array)
        {
	       if(key==num)
             {
		        found=true;
		        break;
              }
        }
        System.out.print(found);
  }
}
