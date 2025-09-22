package q28873;
import java.util.Scanner;
import java.util.*;
class InvalidRollNumberException extends Exception
{
    public InvalidRollNumberException(String message)
	{
        super(message);
	}
}


public class StudentRegistration{
    // write your code here 
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        try {
            // write your code here 
			String name = sc.nextLine();

            int rollNumber = sc.nextInt();
            if (rollNumber < 0) {
                throw new InvalidRollNumberException("Invalid Roll Number");
            }

            sc.nextLine(); // Consume newline character
            String branch = sc.nextLine();
			System.out.println("Student Details:");
			System.out.println("Name: "+name);
			System.out.println("Roll Number: "+rollNumber);
			System.out.println("Branch: "+branch);
        } catch (InvalidRollNumberException e) {
            // wite your code here 
	        System.out.println(e.getMessage());
        }

	}
}
