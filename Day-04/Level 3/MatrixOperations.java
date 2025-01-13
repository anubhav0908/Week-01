import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);  // Generate random values between 0 and 9
            }
        }
        
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        // Matrix multiplication is only possible when the number of columns in matrix1 is equal to the number of rows in matrix2
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of matrix1 must be equal to rows of matrix2.");
        }
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, cannot find inverse.");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, cannot find inverse.");
        }
        
        // Calculate the adjugate matrix
        double[][] adjugate = new double[3][3];
        adjugate[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        adjugate[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / (double) determinant;
        adjugate[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        adjugate[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / (double) determinant;
        adjugate[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        adjugate[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / (double) determinant;
        adjugate[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        adjugate[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / (double) determinant;
        adjugate[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;
        
        return adjugate;
    }

    public static void main(String[] args) {
        // Create random 3x3 matrices
        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);
        
        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        
        // Matrix Addition
        System.out.println("\nMatrix Addition:");
        int[][] additionResult = addMatrices(matrix1, matrix2);
        displayMatrix(additionResult);
        
        // Matrix Subtraction
        System.out.println("\nMatrix Subtraction:");
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractionResult);
        
        // Matrix Multiplication
        System.out.println("\nMatrix Multiplication:");
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multiplicationResult);
        
        // Matrix Transpose
        System.out.println("\nMatrix 1 Transpose:");
        int[][] transposeResult = transposeMatrix(matrix1);
        displayMatrix(transposeResult);
        
        // Determinant of 3x3 matrix
        System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
        
        // Inverse of 3x3 matrix
        System.out.println("\nInverse of Matrix 1 (3x3):");
        double[][] inverseMatrix = inverse3x3(matrix1);
        for (double[] row : inverseMatrix) {
            for (double val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
