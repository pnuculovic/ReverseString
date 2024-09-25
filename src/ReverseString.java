import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the reverseString method and print the result
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
        scanner.close();
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

