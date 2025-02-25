package training;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        int m = n;
        int g = 0;
        int temp = n, digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
       temp = n;
        while (temp > 0) {
            int d = temp % 10;
            g += Math.pow(d, digits);
            temp /= 10;
        }
        if (g == m) {
            System.out.println(m + " is an Armstrong number.");
        } else {
            System.out.println(m + " is not an Armstrong number.");
        }
    }
}
