package q67237;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here 
         Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("-1")) {
                break;  // Exit the loop if the user types '-1'
            }
            text.append(line).append("\n");  // Append the input line to the text
        }

        // Convert the string to a single string from the StringBuilder
        String inputText = text.toString();

        // Count characters
        int characterCount = inputText.length();

        // Count lines (the number of '\n' characters, or lines of input)
        int lineCount = inputText.split("\n").length;

        // Count words (split by whitespace, considering multiple spaces)
        // String[] words = inputText.split("\\s+");
        int wordCount = inputText.split("\\s+").length;

        // Display results
        System.out.println(characterCount);
        System.out.println(lineCount);
        System.out.println(wordCount);

        scanner.close();
        
        
        
        
        
    }
}
