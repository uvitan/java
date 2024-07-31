import java.util.Scanner;

public class MatrixOperationsWithScanner {

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Function to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    // Function to read a matrix from user input
    public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for Matrix A:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matA = readMatrix(scanner, rowsA, colsA);

        System.out.println("Enter the number of rows and columns for Matrix B:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matB = readMatrix(scanner, rowsB, colsB);

        System.out.println("Matrix A:");
        displayMatrix(matA);
        System.out.println("\nMatrix B:");
        displayMatrix(matB);

        System.out.println("\nAddition of A and B:");
        if (rowsA == rowsB && colsA == colsB) {
            int[][] resultAdd = addMatrices(matA, matB);
            displayMatrix(resultAdd);
        } else {
            System.out.println("Addition not possible. Matrices dimensions do not match.");
        }

        System.out.println("\nSubtraction of A and B:");
        if (rowsA == rowsB && colsA == colsB) {
            int[][] resultSub = subtractMatrices(matA, matB);
            displayMatrix(resultSub);
