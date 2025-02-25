package training;

import java.util.Scanner;

public class perfectcube {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b = 0;
		int i=1;
		while(i<=n) {
			if(i*i*i==n) {
				System.out.println("Perfect cube");
			b	= b+ i;}
				i++;
		}
		if(b*b*b!= n) {
				
			System.out.print("Not a Perfect cube");
		}
		
		}}
