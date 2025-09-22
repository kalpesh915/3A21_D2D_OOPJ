package q23720;
import java.util.Scanner;

public class PalindromeChecker {
	// write your code here...
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();//cricket
		String rev="";//tekcirc
		for(int i=s.length()-1;i>=0;i--){
			rev += s.charAt(i);
			//"tekcirc"+
		}
		if(s.equals(rev)){
			System.out.println(s+" is a palindrome");
		}else{
			System.out.println(s+" is not a palindrome");
			
		}
	}
	}


		//cricket
		//0123456
		//s.charAt(0)-> c
		//s.charAt(1)-> r
		//s.charAt(s.length()-1)-> t

// 		Scanner sc=new Scanner(System.in);
// 		String s=sc.next();
// 		String sb=new StringBuffer(s).reverse().toString();
// 		if(s.equals(sb))
// 		{
// 			System.out.println(s+" is a palindrome");
// 		}
// 		else{
// 			System.out.println(s+" is not a palindrome");
// 		}
// 	}
// }
