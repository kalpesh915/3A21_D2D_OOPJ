package q37389;
import java.util.Scanner;

public class PrimeNumbersList {
	// Write your code here..
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		if(t==1)
		{
			System.out.println("No prime numbers found");
		}
		else
		{
			for (int i = 2; i <= t; i++)
				if (isPrime (i))
					System.out.print(i+" ");
		}
	}
	public static boolean isPrime(int n)
	{
		for (int i = 2; i<=Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return false;
		}
	return true;
	}
}