package q67791;
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Write your code here 
        Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		double salary=sc.nextDouble();
		
        System.out.println(name);
		System.out.println(id);
		System.out.println(salary);        
    }
}
