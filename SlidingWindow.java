/**
 * 
 */
package DATASTRUCT;

/**
 * @author jacob.samuel
 *
 */
public class SlidingWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdasdasdasda1";
		int window = 3;
		int left, right;
		int match = 0;
		int count = 0;
		
		String anagram = "a1";
		String substr;		
		left = 0;
		right  = window;
		
		//sliding window
		while (left < str.length() )
		{
			
			substr = str.substring(left, right);
			if (substr.compareTo(anagram)==0)
			{
				System.out.println("Anangram match found after pos: " + left);
				match =1;
				count ++;
			}
			left += window;
			right += window;
			if (right > str.length()-1) right = str.length();
			
		}
		System.out.println("# of matches found: " + count);
		
		if (match ==0)
			System.out.println("Anangram match not found");
	
	}

}
