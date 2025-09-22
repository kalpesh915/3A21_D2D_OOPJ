package q28257;
import java.util.Scanner;

class TeamMember {
	// write your code here
	
	public void performTask()
	{
		// System.out.println("Performing a task as a team member");
	}

}
class Developer extends TeamMember {
	// write your code here 
	// @Override
    public void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the programming language: ");
        String language = scanner.nextLine();
        System.out.println("I am a developer coding in " + language);
    }
	
	
}	
class ProductOwner extends TeamMember {
	// write your code here 
	@Override
    public void performTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the project: ");
        String project = scanner.nextLine();
        System.out.println("I am a product owner managing the " + project);
    }
	
	
}	
public class TeamTest {
    public static void main(String[] args) {
        // Creating an instance of Developer
        Developer developer = new Developer();
        developer.performTask();

        // Creating an instance of ProductOwner
        ProductOwner productOwner = new ProductOwner();
        productOwner.performTask();
    }
}
