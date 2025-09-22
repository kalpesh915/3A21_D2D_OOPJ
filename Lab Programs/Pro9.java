package q67112;
import java.util.*;
import java.io.*;
import java.lang.*;

class SortNames {
	public static void main(String args[]) {
		// write your code here 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
		
	
	}
}