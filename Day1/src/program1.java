import java.util.HashMap;
import java.util.Map;

public class program1 {

    public static void main(String[] args) {
        // Sample input string
        String input = "Hello World! 123";

        // Call the method to count character frequencies
        countCharacterFrequency(input);
    }

    public static void countCharacterFrequency(String input) {
        // Convert the input string to lowercase to ignore case sensitivity
        input = input.toLowerCase();

        // Create a map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter or a number (ignoring special characters)
            if (Character.isLetterOrDigit(ch)) {
                // If the character is already in the map, increment its frequency
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
