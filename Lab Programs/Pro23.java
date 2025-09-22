package q64074;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Custom exception for negative values
class NegativeValueException extends Exception {
    // Code here..
     public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for values out of range (0-100)
class OutOfRangeException extends Exception {
    // Code here..
     public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarksException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> results = new ArrayList<>();

        try {
            int n = Integer.parseInt(scanner.nextLine().trim()); // Number of students

            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine().trim(); // Read student name
                int totalMarks = 0;
                boolean errorOccurred = false;

                for (int j = 0; j < 3; j++) {
                    String input = scanner.nextLine().trim();

                    try {
                    	// Code here..
                    	int marks = Integer.parseInt(input);

                        // Check for negative marks
                        if (marks < 0) {
                            throw new NegativeValueException("Negative values not allowed");
                        }

                        // Check if marks are within the valid range
                        if (marks > 100) {
                            throw new OutOfRangeException("Marks must be between 0 and 100");
                        }

                        totalMarks += marks;
                    } catch (NumberFormatException e) {
                        results.add("Not an integer");
                        errorOccurred = true;
                        break; // Stop further processing if invalid input is encountered
                    } catch (NegativeValueException | OutOfRangeException e) {
                        results.add(e.getMessage());
                        errorOccurred = true;
                        break; // Stop further processing if custom exceptions are thrown
                    }
                }

                if (!errorOccurred) {
                    double average = totalMarks / 3.0;
                    results.add(String.format("%.2f", average)); // Store the average with two decimal places
                } else {
                    break; // Stop further execution if an error occurred
                }
            }
                    	


            // Display results only at the end
            for (String result : results) {
                System.out.println(result);
            }

        } finally {
            // Code here..
            System.out.println("Program terminated");
            
            scanner.close(); // Ensure scanner is closed at the end
        }
    }
}