
import java.util.Scanner;

public class Matrix_Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions
        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if multiplication is possible (columns of first matrix == rows of second matrix)
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return; // Exit the program if multiplication is not possible
        }

        // Input elements for the first matrix
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiply the matrices
        int[][] result = new int[rows1][cols2];

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0; // Initialize the result element to 0
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Output the result matrix
        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//output
// 1 2 3 4 
// 5 6 7 8

// 19 22 
// 43 50 
