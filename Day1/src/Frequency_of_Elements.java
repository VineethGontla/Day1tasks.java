
import java.util.Scanner;

public class Frequency_of_Elements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare and input elements for the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Count frequency of each element
        System.out.println("Frequency of each element:");
        for (int i = 0; i < size; i++) {
            boolean isPrinted = false; // Flag to check if the element is already counted
            int count = 1;  // Initialize count to 1 (since it's already found once)

            // Skip already counted elements
            if (isPrinted) {
                continue;
            }

            // Loop to count occurrences of array[i] in the rest of the array
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    isPrinted = true;
                    array[j] = -1;  // Mark the element as counted by changing it to a non-valid number
                }
            }

            // Print the frequency of the element
            if (array[i] != -1) {
                System.out.println("Element " + array[i] + " appears " + count + " times.");
            }
        }

        scanner.close();
    }
}

//output:
//	Enter the number of elements in the array: 5
//	Enter the elements of the array:
//	1 2 2 3 1
//	Frequency of each element:
//	Element 1 appears 2 times.
//	Element 2 appears 2 times.
//	Element 3 appears 1 times.



