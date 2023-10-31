/**********************************************************************************
 * File:TransposeOfAMatrix.java
 * Description:To display transpose of a given matrix
 * Author:Neha Maria Joji
 * Version:1.0
 * Date:31/10/23
 **********************************************************************************/
package javaLab;
import java.util.Scanner;
public class TransposeOfAMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the matrix:");
		int row=sc.nextInt();
		int column=sc.nextInt();
		int[][]matrix=new int[row][column];
		System.out.println("enter the values of matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose of the Matrix:");
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
