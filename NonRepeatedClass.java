/**
 * 
 */
package DATASTRUCT;

/**
 * @author jacob.samuel
 *
 */
public class NonRepeatedClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = new String( "Stress");
		int len_of_Str = Str.length();
		
		String [] TearStr = new String[len_of_Str];
		
		System.out.println(" Enterign Loop");
		for (int i=0;i< len_of_Str;i++)
			{
			System.out.println("Loop: " + i);
			  	for(int j=i;j<=i+1;j++) 
				{
			  		TearStr[i]= Str.substring(i, j)	;
				}
			  	System.out.println("String in Array: " + TearStr[i]);
			}
	}

}
