package strings;

import java.util.Scanner;

public class paranthesesbalance {
public static void main(String[]args)
{

	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();

	        int count=0;
	        for(int i=0;i<str.length();i++){
	            char ch=str.charAt(i);
	            if(ch=='('){
	                count++;
	            } else if (ch==')'){
	                count--;

	            }

	        }
	        if(count == 0){
	            System.out.println("balanced");
	        }
	        else if(count<1){
	            System.out.println("unbalanced");
	        }
	        else{
	            System.out.println("unbalanced");
	        }
	    }
	
}

