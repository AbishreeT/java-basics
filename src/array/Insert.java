package array;

import java.util.*;

public class Insert {
public static void main(String[]args)
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to insert: ");
        int value = scanner.nextInt();
        System.out.print("Enter the position (0-based index): ");
        int position = scanner.nextInt();
         if (position < 0 || position > size) {
            System.out.println("Invalid position! Please enter a position between 0 and " + size);
            return;
        }
        int[] newArr = new int[size + 1];
         for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = value; // Insert new value at given position
            } else {
                newArr[i] = arr[j++]; // Copy old elements
            }
        }
         System.out.println("Array after insertion:");
         System.out.print(Arrays.toString(newArr));
          scanner.close();
    }
}
