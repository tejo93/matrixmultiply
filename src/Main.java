import java.util.Scanner;


public class Main extends MatrixMultiply{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int rowsofmatrix1;
		int columnsofmatrix1;
		int columnsofmatrix2;
		int rowsofmatrix2;
		int [][] finalmatrix;
		System.out.println("Please enter number of rows required for matrix 1");
		rowsofmatrix1 = Integer.parseInt(in.nextLine());
		System.out.println("Please enter number of columns required for matrix 1");
		columnsofmatrix1 = Integer.parseInt(in.nextLine());
		System.out.println("Please enter number of rows required for matrix 2");
		rowsofmatrix2 = Integer.parseInt(in.nextLine());
		if(columnsofmatrix1 == rowsofmatrix2)
		{
			System.out.println("Please enter number of columns required for matrix 2");
			columnsofmatrix2 = Integer.parseInt(in.nextLine());
			MatrixMultiply object1 = new MatrixMultiply();
			finalmatrix=object1.Takeinputformatrix(rowsofmatrix1, rowsofmatrix2, columnsofmatrix1, columnsofmatrix2);
			//finalmatrix= object1.resultantmatrix();
			for (int i=0;i<rowsofmatrix1;i++)
			{
				System.out.print("|");
				for (int j=0;j<columnsofmatrix2;j++)
				{
					
				System.out.print(finalmatrix[i][j]);
				System.out.print(" ");
				
				}
				System.out.print("|");
				System.out.println();
			}
		}
		else
		{
			System.out.println("Sorry you have entered wrong parameteres for matrix multiplication");
			System.out.println("Columns of matrix 1 should be equal to Rows of matrix 2");
		}
		
		
		
		
	}

}
