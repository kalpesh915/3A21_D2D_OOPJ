package q63091;
import java.util.StringTokenizer;
import java.util.Scanner;

public class StringToken {
	// Write your code here...
	public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string of integers separated by spaces
        String line = scanner.nextLine(); // Read the entire line
        
        // Create StringTokenizer object to split the string by space (" ")
        StringTokenizer st = new StringTokenizer(line);

        // Initialize the sum variable to 0
        int sum = 0;

        // Loop through the tokens and process each one
        while (st.hasMoreTokens()) {
            // Get the next token and convert it to an integer
            String token = st.nextToken();
            try {
                int num = Integer.parseInt(token); // Parse the token to an integer
                System.out.println(num); // Print the integer
                sum += num; // Add the integer to the sum
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + token);
            }
        }

        // Display the sum of the integers
        System.out.println(sum);

        // Close the scanner
        scanner.close();
    }
}	