import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Call the method to check if strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to lower case to ignore case sensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Create two arrays to store character counts
        int[] count1 = new int[26]; 
        int[] count2 = new int[26];

        // Count characters for both strings
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++; 
            count2[str2.charAt(i) - 'a']++; 
        }

        // Compare the counts of characters in both strings
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false; // If counts don't match, they are not anagrams
            }
        }

        return true; // If all counts match, they are anagrams
    }
}
