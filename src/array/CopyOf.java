package array;
import java.util.Arrays;
public class CopyOf {
	

	
	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4, 5};
	        
	        // Copy with increased length
	        int[] extended = Arrays.copyOf(original, 7);
	        System.out.println(Arrays.toString(extended)); // [1, 2, 3, 4, 5, 0, 0]

	        // Copy with reduced length
	        int[] shortened = Arrays.copyOf(original, 3);
	        System.out.println(Arrays.toString(shortened)); // [1, 2, 3]

	        // Copy with the same length
	        int[] exactCopy = Arrays.copyOf(original, original.length);
	        System.out.println(Arrays.toString(exactCopy)); // [1, 2, 3, 4, 5]
	    }
}
	


