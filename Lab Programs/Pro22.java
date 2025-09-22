package q28339;
import java.util.Scanner;
public class PercentageCalculator {
   public static void main(String[] args)
	{
	// write the code..
	   Scanner sc=new Scanner(System.in);
        try {
            int numerator = Integer.parseInt(sc.nextLine());
            int denominator = Integer.parseInt(sc.nextLine());
		
			 if (denominator == 0)
		{
            throw new ArithmeticException();
        }
            double percentage = ((double) numerator / denominator) * 100;
            System.out.printf("%.2f%%\n", percentage);
        } catch (NumberFormatException e) {
        	
            System.out.println("Error: Invalid input");
            
        } catch (ArithmeticException e1) {
        	
            System.out.println("Error: Division by zero");
        }
	}
}
