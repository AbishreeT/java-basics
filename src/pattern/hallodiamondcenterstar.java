package pattern;

public class hallodiamondcenterstar {
	public static void main(String[]args)
	{
	//hallow diamond
            int n =5;
	        for (int i = 1; i<n; i++) {
	            for (int j=i; j<n; j++) {
	                System.out.print(" ");
	            }
	            for (int j=1; j<=2*i-1; j++){
	                if(i==n||i==1||j==1|j==2*i-1){
	                    System.out.print("*");

	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(" ");
	        }
	        for (int i = n; i>=1; i--) {
	            for (int j=1; j<=n-i; j++) {
	                System.out.print(" ");
	            }
	            for (int j=1; j<=2*i-1; j++){
	                if(i==n||i==1||j==1|j==2*i-1){
	                    System.out.print("*");

	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(" ");
	        }
	    }
	}

