
import java.util.Scanner;

public class ArrayElementComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Declare arrays of the given size
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        // Compare elements of the arrays
        for (int i = 0; i < size; i++) {
            System.out.print("Comparing elements at index " + i + ": ");
            // Use conditional operator to compare each element
            String result = (array1[i] == array2[i]) ? "equal" :
                            (array1[i] > array2[i]) ? "greater" : "lesser";
            System.out.println("Array1[" + i + "] = " + array1[i] + " is " + result + " than Array2[" + i + "] = " + array2[i]);
        }

        scanner.close();
    }
}

//output:
//	Enter the size of the arrays: 3
//	Enter elements for the first array:
//	1 2 3
//	Enter elements for the second array:
//	4 5 6
//	Comparing elements at index 0: Array1[0] = 1 is lesser than Array2[0] = 4
//	Comparing elements at index 1: Array1[1] = 2 is lesser than Array2[1] = 5
//	Comparing elements at index 2: Array1[2] = 3 is lesser than Array2[2] = 6


