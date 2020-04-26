/**
 * 
 */
package DATASTRUCT;

/**
 * @author jacob.samuel
 *
 */
public class Recursivefact {

	/**
	 * @param args
	 */
	public static int factorial(int val)
	
	{
		if  (val>0)
		return (val * factorial(val-1));
		else 
			return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = factorial (5);
		
		System.out.println(total+ ": Facotrial ");

	}

	
	
}
