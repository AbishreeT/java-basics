package strings;

public class findmaxfreqandprint 
{
public static void main(String[]args)
{
	String input = "example string";
     char maxChar = ' ';
	   int maxCount = 0;
    for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            int count = 0;
	            for (int j = 0; j < input.length(); j++) {
	                if (input.charAt(j) == currentChar) {
	                    count++;
	                }
	            } if (count > maxCount) {
	                maxCount = count;
	                maxChar = currentChar;
	            }
	        } System.out.println("Character: '" + maxChar + "', Frequency: " + maxCount);
	  }
}
