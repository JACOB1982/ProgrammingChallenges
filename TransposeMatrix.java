/**
 * 
 */
package DATASTRUCT;

import java.util.Arrays;

/**
 * @author jacob.samuel
 *
 */
public class TransposeMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner keyin = new Scanner(System.in);
		//data_type[][] array_name = new data_type[x][y];
		//data_type[][] array_name = {
          //      {valueR1C1, valueR1C2, ....}, 
            //    {valueR2C1, valueR2C2, ....}
              //};
		int xctr, yctr, row,col;
		// Only square matrixes , i.e  M*N where M=N;
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9} };
		//int matrix[][] = {{1,2},{4,5} };
		int tmpMatrix[][]= new int [matrix.length][matrix[0].length];
		row = matrix.length;
		col = matrix[0].length;

		System.out.println("Before Transpose...!!");
		System.out.println("Row " + row);
		System.out.println("Column " + col);
		
		for (xctr = 0; xctr <row; xctr ++)
		{
			for (yctr = 0; yctr < col; yctr++)
			{
				System.out.print(matrix[xctr][yctr]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("After one level  Transpose...!!");
		
		for (xctr = 0; xctr<row; xctr++)
		{
			int magicnum = row-1;
			for(yctr = 0; yctr <col; yctr++)
			{
				//System.out.print("Value from orginal: " +matrix[magicnum][xctr]+ " ");
				tmpMatrix[xctr][yctr]=matrix[magicnum][xctr];
				if (magicnum>0)
					magicnum = magicnum -1;
				else 
					magicnum = 0;
				
				//System.out.print("Value to temp"+tmpMatrix[xctr][yctr]+ " ");
					
			}
		}

		for (xctr = 0; xctr <row; xctr ++)
		{
			for (yctr = 0; yctr < col; yctr++)
			{
				System.out.print(tmpMatrix[xctr][yctr]+ " ");
			}
			System.out.println();
		}
		
		matrix = tmpMatrix.clone();
		System.out.println("original matrix update..!!");
		for (xctr = 0; xctr <row; xctr ++)
		{
			for (yctr = 0; yctr < col; yctr++)
			{
				System.out.print(matrix[xctr][yctr]+ " ");
				tmpMatrix[xctr][yctr] = 0;
			}
			System.out.println();
		}
		// we can repeat the above logic for N number of transpose actions.
}

}