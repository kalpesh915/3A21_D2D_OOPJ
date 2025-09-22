package q67236;
import java.util.Scanner;
public class Fibonacci {
	// Recurise function to find the nth Fibonacci number 
    public static int fibonacciRecursive(int n) {
        // write your code here 
		if(n<=1)
			return n;
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }
    // Non-recursive function to find the nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        // write your code here 
		if (n == 1 || n == 2) {
            return 1; 
        }
        int a = 1, b = 1;  
        for (int i = 3; i <= n; i++)
		{
            int next = a + b; 
            a = b;  
            b = next;  
        }
        return b; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        System.out.println(fibonacciRecursive(n));
        System.out.println(fibonacciNonRecursive(n));
        scanner.close();
    }
}
