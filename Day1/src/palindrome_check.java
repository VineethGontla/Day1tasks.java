

import java.util.Scanner;

public class palindrome_check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replace(" ", "").toLowerCase();

        // Compare characters from both ends of the string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // If all characters match, it's a palindrome
        return true;
    }
}

