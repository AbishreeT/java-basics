package array;
import java.util.Arrays;
public class Deepequals {
	
	
	    public static void main(String[] args) {
	        int[][] array1 = {{1, 2, 3}, {4, 5,6}};
	        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] array3 = {{1, 2, 3}, {4, 5, 7}};

	        System.out.println(Arrays.deepEquals(array1, array2)); // true
	        System.out.println(Arrays.deepEquals(array1, array3)); // false
	    }
	}


