package q21927;
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        // write your code here
        
		Scanner scanner = new Scanner(System.in);
        
        int nRows = 3;
        int nCols = 3;
        
        int[][] matrix1 = new int[nRows][nCols];
        int[][] matrix2 = new int[nRows][nCols];
        
        System.out.println("Matrix 1:");
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                matrix1[r][c] = scanner.nextInt();
            }
        }
		 System.out.println("Matrix 2:");
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                matrix2[r][c] = scanner.nextInt();
            }
        }
        
        int[][] result = multiplyMatrices(matrix1, matrix2);
        
        System.out.println("Resultant Matrix:");
        printMatrix(result);
        
        scanner.close();
        
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        // complete this function
        int nRows = matrix1.length;
        int nCols = matrix2[0].length;
        int[][] result = new int[nRows][nCols];
            
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                result[r][c] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[r][c] += matrix1[r][k] * matrix2[k][c];
                }
            }
        }
        
        return result;
        
        
    }
    public static void printMatrix(int[][] matrix) {
        // complete this function
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        
    }
}
