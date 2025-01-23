
import java.util.Scanner;

public class vowel_consonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase for easy comparison
        input = input.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Use switch statement to check for vowels
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount++;
                        break;
                    default:
                        consonantCount++;
                        break;
                }
            }
        }

        // Output the counts
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}

