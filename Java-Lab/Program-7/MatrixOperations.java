import java.util.Scanner;

public class MatrixOperations {
  private static final Scanner SCANNER = new Scanner(System.in);
  private int[][] matrix;

  public MatrixOperations(int rows, int cols) {
    matrix = new int[rows][cols];
    System.out.println("Enter matrix elements:");
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        matrix[i][j] = SCANNER.nextInt();
  }

  public int calculateTrace() {
    int trace = 0;
    for (int i = 0; i < Math.min(matrix.length, matrix[0].length); i++)
      trace += matrix[i][i];
    return trace;
  }

  public int[][] calculateTranspose() {
    int rows = matrix.length, cols = matrix[0].length;
    int[][] transpose = new int[cols][rows];
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        transpose[j][i] = matrix[i][j];
    return transpose;
  }

  public void printMatrix(int[][] mat) {
    for (int[] row : mat) {
      for (int element : row)
        System.out.print(element + " ");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter rows and columns: ");
    int rows = SCANNER.nextInt(), cols = SCANNER.nextInt();
    MatrixOperations mo = new MatrixOperations(rows, cols);

    if (rows == cols) System.out.println("Trace: " + mo.calculateTrace());
    else System.out.println("Trace not possible for non-square matrices.");
    
    System.out.println("Transpose:");
    mo.printMatrix(mo.calculateTranspose());
  }
}
