package q28190;
import java.util.Scanner;

class NumberIn {
	// write your code here...
	 int num;
	public void inputNum()
	{
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	
}
class FactorialOut extends NumberIn{
	// write your code here...
	 public void displayFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

}

public class FactorialInfo {
    public static void main(String[] args) {
        // Creating an instance of FactorialOut
        FactorialOut factorialOut = new FactorialOut();
        // Input for the number
        factorialOut.inputNum();
        // Displaying the factorial of the entered number
        factorialOut.displayFactorial();
    }
}
