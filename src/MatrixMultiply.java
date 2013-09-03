import java.util.Scanner;


public class MatrixMultiply {
	
	public int row1;
	public int row2;
	public int column1;
	public int column2;
	public int [][] matrix1;
	public int [][] matrix2;
	public int[][] matrix3;
	
	Scanner in = new Scanner(System.in);
	
	
	public int[][] Takeinputformatrix(int frow1,int frow2,int fcolumn1,int fcolumn2)
	{
		row1=frow1;
		row2=frow2;
		column1=fcolumn1;
		column2=fcolumn2;
		matrix1 = new int [frow1][fcolumn1];
		matrix2 = new int [frow2][fcolumn2];
		matrix3 = new int [row1][column2];
		
		for (int i=0;i<frow1;i++)
		{
			for (int  j=0;j<fcolumn1;j++)
			{
				
			System.out.println("Enter value for row "+i+"and column "+j+"for matrix 1");
			matrix1[i][j] = Integer.parseInt(in.next());
			}
		}
		for (int i=0;i<frow2;i++)
		{
			for (int  j=0;j<fcolumn2;j++)
			{
			System.out.println("Enter value for row "+i+"and column "+j+" for matrix 2");
			matrix2[i][j] = Integer.parseInt(in.next());
			}
		}
		matrix3 = resultantmatrix(matrix1,matrix2);
		return matrix3;
	}
	public int [][] resultantmatrix(int [][] matrix1, int [][] matrix2)
	{
		for (int k=0;k<column1;k++)
		{
		for (int i=0;i<row1;i++)
		{
			for (int j=0;j<column2;j++)
			{	
				matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
			}
		}
		}
		
		return matrix3;
	}

}
