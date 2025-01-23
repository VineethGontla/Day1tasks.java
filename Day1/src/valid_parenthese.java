
import java.util.Stack;

public class valid_parenthese {

    public static void main(String[] args) {
        // Test strings
        String input = "{[()]}"; // You can change this to test different strings

        // Call function to check if the parentheses are valid
        if (isValid(input)) {
            System.out.println("The string has valid parentheses.");
        } else {
            System.out.println("The string has invalid parentheses.");
        }
    }

    public static boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } 
            // If the character is a closing bracket
            else if (ch == '}' || ch == ']' || ch == ')') {
                // If the stack is empty or the top of the stack does not match the closing bracket, return false
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                // Check if the top of the stack matches the correct opening bracket
                if ((ch == '}' && top != '{') || (ch == ']' && top != '[') || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are matched; otherwise, it's invalid
        return stack.isEmpty();
    }
}
//output:
//	
//	"{[()]}"
//The string has valid parentheses.

