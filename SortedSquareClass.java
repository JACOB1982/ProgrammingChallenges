/**
 * 
 */
package DATASTRUCT;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author jacob.samuel
 *
 */
public class SortedSquareClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[] = new int[6];
		Arr[0]= -6;
		Arr[1]= 0;
		Arr[2]= -7;
		Arr[3]= 1;
		Arr[4]= 2;
		Arr[5]= 12;
		
		TreeSet TSint = new TreeSet();
		TreeSet TSafter = new TreeSet();
		
		for (int i = 0; i<Arr.length;i++)
		{
			TSint.add(Arr[i]);	
		}
		
		System.out.println("Array to Treeset :" + TSint);
		
		Iterator itr = TSint.iterator();
		while (itr.hasNext())
		{
			int tmp = (int) itr.next();
			TSafter.add( tmp * tmp);
		}
		
		System.out.println("Treeset Operation:" + TSafter);
	}	

}
