
/*
 * Program 13: Perform matrix addition, subtraction, multiplication,
 * transpose, determinant, and inverse operations.
 * Generate random matrices and display the results.
 */
package Methods.level3;

import java.util.Scanner;

public class MatrixOperations {

    // a. Generate a random matrix using rows and columns.
    public static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        return matrix;
    }

    // b. Add two matrices of the same dimensions.
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // c. Subtract matrix B from matrix A.
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    // d. Multiply matrices when columns of A equal rows of B.
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int columnsA = a[0].length;
        int rowsB = b.length;
        int columnsB = b[0].length;

        if (columnsA != rowsB) {
            throw new IllegalArgumentException(
                    "Columns of A must equal rows of B.");
        }

        int[][] result = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // e. Find the transpose of a matrix.
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // f. Find the determinant of a 2x2 matrix.
    public static double determinant2x2(int[][] matrix) {
        if (matrix.length != 2
                || matrix[0].length != 2
                || matrix[1].length != 2) {
            throw new IllegalArgumentException(
                    "A 2x2 matrix is required.");
        }

        return (double) matrix[0][0] * matrix[1][1]
                - (double) matrix[0][1] * matrix[1][0];
    }

    // g. Find the determinant of a 3x3 matrix.
    public static double determinant3x3(int[][] matrix) {
        if (matrix.length != 3
                || matrix[0].length != 3
                || matrix[1].length != 3
                || matrix[2].length != 3) {
            throw new IllegalArgumentException(
                    "A 3x3 matrix is required.");
        }

        return (double) matrix[0][0]
                * (matrix[1][1] * matrix[2][2]
                - matrix[1][2] * matrix[2][1])
                - (double) matrix[0][1]
                * (matrix[1][0] * matrix[2][2]
                - matrix[1][2] * matrix[2][0])
                + (double) matrix[0][2]
                * (matrix[1][0] * matrix[2][1]
                - matrix[1][1] * matrix[2][0]);
    }

    // h. Find the inverse of a 2x2 matrix.
    public static double[][] inverse2x2(int[][] matrix) {
        double determinant = determinant2x2(matrix);

        if (Math.abs(determinant) < 1e-9) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }

    // i. Find the inverse of a 3x3 matrix using cofactors.
    public static double[][] inverse3x3(int[][] matrix) {
        double determinant = determinant3x3(matrix);

        if (Math.abs(determinant) < 1e-9) {
            return null;
        }

        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int r1 = (i + 1) % 3;
                int r2 = (i + 2) % 3;
                int c1 = (j + 1) % 3;
                int c2 = (j + 2) % 3;

                double cofactor =
                        (double) matrix[r1][c1] * matrix[r2][c2]
                                - (double) matrix[r1][c2] * matrix[r2][c1];

                // Apply the cofactor sign pattern.
                if ((i + j) % 2 != 0) {
                    cofactor = -cofactor;
                }

                // Transpose the cofactor matrix and divide by determinant.
                inverse[j][i] = cofactor / determinant;
            }
        }

        return inverse;
    }

    // j. Display an integer matrix.
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%6d", value);
            }
            System.out.println();
        }
    }

    // Display a matrix containing decimal values.
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%10.2f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Please enter 2 or 3.");
            sc.close();
            return;
        }

        // Generate two square matrices for all required operations.
        int[][] a = generateRandomMatrix(size, size);
        int[][] b = generateRandomMatrix(size, size);

        System.out.println("\nMatrix A:");
        displayMatrix(a);

        System.out.println("\nMatrix B:");
        displayMatrix(b);

        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrices(a, b));

        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrices(a, b));

        System.out.println("\nMultiplication (A x B):");
        displayMatrix(multiplyMatrices(a, b));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(a));

        double determinant;
        double[][] inverse;

        if (size == 2) {
            determinant = determinant2x2(a);
            inverse = inverse2x2(a);
        } else {
            determinant = determinant3x3(a);
            inverse = inverse3x3(a);
        }

        System.out.printf("%nDeterminant of A: %.2f%n", determinant);

        if (inverse == null) {
            System.out.println(
                    "Inverse does not exist because the determinant is zero.");
        } else {
            System.out.println("\nInverse of A:");
            displayMatrix(inverse);
        }

        sc.close();
    }
}
