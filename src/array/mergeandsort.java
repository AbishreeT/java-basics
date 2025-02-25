package array;

public class mergeandsort {
public static void main(String[]args)
{
	
	        int[] array1 = {1, 3, 5, 7};
	        int[] array2 = {2, 4, 6, 8};

	        // Call the merge function
	        int[] mergedArray = mergeArrays(array1, array2);

	        // Print the merged array
	        for (int element : mergedArray) {
	            System.out.print(element + " ");
	        }
	    }

	    // Function to merge two arrays
	    public static int[] mergeArrays(int[] array1, int[] array2) {
	        int[] mergedArray = new int[array1.length + array2.length];

	        // Copy elements from the first array
	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

	        // Copy elements from the second array
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        return mergedArray;
	    
}
}
