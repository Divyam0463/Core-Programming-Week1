import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        Random random = new Random();
        int rows1 = random.nextInt(3) + 2; // 2x2 or 3x3
        int cols1 = random.nextInt(3) + 2;
        int rows2 = (cols1 == 2) ? 2 : 3; // Ensure compatible for multiplication
        int cols2 = (cols1 == 2) ? 2 : 3;

        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);


        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Sum:");
            displayMatrix(addMatrices(matrix1, matrix2));
            System.out.println("Difference:");
            displayMatrix(subtractMatrices(matrix1, matrix2));
        }

        if (cols1 == rows2) {
            System.out.println("Product:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        }

        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose(matrix1));

        if (rows1 == cols1 && rows1 <= 3) { // Determinant and Inverse only for square matrices up to 3x3
            double det = determinant(matrix1);
            System.out.println("Determinant of Matrix 1: " + det);
            if (det != 0) {
                System.out.println("Inverse of Matrix 1:");
                displayMatrix(inverse(matrix1, det));
            } else {
                System.out.println("Matrix 1 is singular (no inverse).");
            }
        }
    }

    static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // between 0 and 9
            }
        }
        return matrix;
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
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

    static int[][] subtractMatrices(int[][] a, int[][] b) {
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

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
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

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    static double determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (n == 3) {
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                    - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                    + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
        return 0; // Or throw an exception for larger matrices.
    }


    static int[][] inverse(int[][] matrix, double det) {
      int n = matrix.length;
      if (n == 2) {
          int[][] inv = new int[2][2];
          inv[0][0] = matrix[1][1];
          inv[0][1] = -matrix[0][1];
          inv[1][0] = -matrix[1][0];
          inv[1][1] = matrix[0][0];
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  inv[i][j] *= (1.0/det); // Multiply by 1/det
              }
          }
          return inv;
      } else if (n == 3) {
          int[][] inv = new int[3][3];
          double[][] cofactor = new double[3][3];

          cofactor[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
          cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
          cofactor[0][2] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
          cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
          cofactor[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
          cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
          cofactor[2][0] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);
          cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
          cofactor[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);


          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  inv[i][j] = (int)(cofactor[j][i] / det); // Adjugate and multiply by 1/det
              }
          }
          return inv;
      }
      return null;
  }



    static void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Null Matrix");
            return;
        }
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val); // Format for better align
            }
            System.out.println();
        }
    }
}