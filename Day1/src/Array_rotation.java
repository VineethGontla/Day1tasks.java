
import java.util.Scanner;

public class Array_rotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number of rotations and direction
        System.out.print("Enter the number of rotations: ");
        int n = scanner.nextInt();

        System.out.print("Enter the direction (1 for right, -1 for left): ");
        int direction = scanner.nextInt();

        // Rotate the array based on user input
        rotateArray(arr, n, direction);

        // Output the rotated array
        System.out.println("The rotated array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    public static void rotateArray(int[] arr, int n, int direction) {
        int size = arr.length;

        // Handle rotation larger than array size
        n = n % size;

        if (direction == 1) {
            // Rotate right
            for (int i = 0; i < n; i++) {
                int temp = arr[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        } else if (direction == -1) {
            // Rotate left
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                for (int j = 0; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = temp;
            }
        }
    }
}

