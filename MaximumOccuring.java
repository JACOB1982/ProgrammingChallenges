/**
 * 
 */
package DATASTRUCT;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author jacob.samuel
 *
 */
public class MaximumOccuring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Str = "Java"; 
		 String Str = "kafka";
		TreeMap<String,Integer> Tree1 = new TreeMap<String,Integer>();
		int i,j,cntr = 1;
		String tmp;
		for (i=0;i<Str.length();i++)
		{
				tmp = Str.substring(i, i+1);
				//System.out.println("substring: "+ tmp );
			
			if (Tree1.isEmpty())
				Tree1.put(tmp, cntr);
			else
			{
				if(Tree1.containsKey(tmp))
					{
						//Iterator itr = Tree1.entrySet().iterator();
						//Entry itr = Tree1.entrySet();
					//System.out.println("Repetitive element " + tmp);
						for(Entry itr: Tree1.entrySet())
						{
							int countr;
							String tmp1 = (String) itr.getKey();
							//System.out.println("Temp1 element" + tmp1);
							if (tmp.equals(tmp1))
							{
								//System.out.println("Tree Key " + itr.getKey());
								//System.out.println("Tree Value " + itr.getValue());

								countr = (int) itr.getValue();
								countr++;
								itr.setValue(countr);
							}
	
	
						}
	
					}
				else Tree1.put(tmp, cntr);
				
			}


		}	

		System.out.println("Tree values "+ Tree1);
		//System.out.println("Tree size "+ Tree1.size());
		//System.out.println("Tree last ");
	}
	

}