import java.util.Scanner;

public class MaxSubarraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the maximum subarray sum
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);

        scanner.close();
    }

    public static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];  // Start with the first element
        int maxEndingHere = arr[0];  // Start with the first element

        // Loop through the array from the second element onwards
        for (int i = 1; i < arr.length; i++) {
            // Decide whether to add the current element to the existing subarray
            // or start a new subarray with the current element
            maxEndingHere = (arr[i] > maxEndingHere + arr[i]) ? arr[i] : maxEndingHere + arr[i];

            // Update the max sum so far
            maxSoFar = (maxEndingHere > maxSoFar) ? maxEndingHere : maxSoFar;
        }

        return maxSoFar;
    }
}

