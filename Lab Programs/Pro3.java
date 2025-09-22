package q67144;
import java.util.Scanner;

//  Write your code here for Arithmetic Operations Class
class ArithmeticOperations{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		return a/b;
	}
	public int modulus(int a,int b)
	{
		return a%b;
	}
}



// Write your code here for Bitwise Operations Class
class BitwiseOperations{
	public int andOp(int a,int b)
	{
		return a&b;
	}
	public int orOp(int a,int b)
	{
		return a|b;
	}
	public int xorOp(int a,int b)
	{
		return a^b;
	}
	public int leftShift(int a,int b)
	{
		return a<<b;
	}
	public int rightShift(int a,int b)
	{
		return a>>b;
	}
}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println(arithmetic.add(num1, num2));
        System.out.println(arithmetic.subtract(num1, num2));
        System.out.println(arithmetic.multiply(num1, num2));
        System.out.println(arithmetic.divide(num1, num2));
        System.out.println(arithmetic.modulus(num1, num2));
        
        System.out.println(bitwise.andOp(num1, num2));
        System.out.println(bitwise.orOp(num1, num2));
        System.out.println(bitwise.xorOp(num1, num2));
        System.out.println(bitwise.leftShift(num1, 2)); 
        System.out.println(bitwise.rightShift(num1, 2));
    }
}
