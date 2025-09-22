package mypackage1;
public class Addition {
    public void calculate(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}


package mypackage2;
public class Multiplication {
    public void calculate(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}


package q37459;
import java.util.Scanner;




// write your code here
import java.util.Scanner;
import mypackage1.Addition;
import mypackage2.Multiplication;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take two integer inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        // Create instances of Addition and Multiplication
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        // Call calculate methods
        addition.calculate(num1, num2);
        multiplication.calculate(num1, num2);
    }
}
