/*
 * Question 9: Convert a two-dimensional array into a
 * one-dimensional array and display its elements.
 */
package Arrays.level1;
import java.util.Scanner;
public class MatrixTo1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Invalid dimensions. Rows and columns must be positive.");
            sc.close();
            return;
        }
        // Create the two-dimensional array
        int[][] matrix = new int[rows][columns];
        // Read matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Create a one-dimensional array for all matrix elements
        int[] oneDimensionalArray = new int[rows * columns];
        int index = 0;
        // Copy each matrix element into the one-dimensional array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                oneDimensionalArray[index] = matrix[i][j];
                index++;
            }
        }
        // Display the one-dimensional array
        System.out.print("One-dimensional array: ");
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            System.out.print(oneDimensionalArray[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}