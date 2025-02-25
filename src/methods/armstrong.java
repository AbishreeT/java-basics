package methods;

public class armstrong {
	public static void main(String [] args){
        int a = 153;
        if ( a == arm(a))
        System.out.println("Armstrong Number");
        else 
        System.out.println("Not");
     }
     public static int arm(int a){
        int b = a;
        int c = a;
        int count =0;
        int sum = 0;
        while(b>0){
           int d = b%10;
           b = b/10;
           count++;
        }
        while(c>0){
           int product = 1;
           int rem = c%10;
           for(int i = 1;i<=count ; i++){
              product = product * rem;}
           sum = sum+product;
           c =c/10;}
        return sum;}
}
