package training;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class reaaarangetolargestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      
        // Convert number to String, then to Character array
        String numStr = Integer.toString(n);
        Character[] digits = new Character[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i);  // Store digits as characters
        }

        // Sort the digits in descending order
        Arrays.sort(digits, Collections.reverseOrder());

        // Build the new number from sorted digits
        StringBuilder sortedNum = new StringBuilder();
        for (char digit : digits) {
            sortedNum.append(digit);
        }

        // Convert back to integer
        int sortedNumber = Integer.parseInt(sortedNum.toString());

        System.out.println("Sorted number in descending order: " + sortedNumber);
    }
}
