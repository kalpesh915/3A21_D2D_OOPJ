package q29111;
import java.util.ArrayList;
import java.util.Scanner;

public class ElementRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the list of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt())
		{
            numbers.add(scanner.nextInt());
        }
        scanner.next();
        int elementToRemove = scanner.nextInt();
		ArrayList<Integer> modifiedList = new ArrayList<>(numbers);
		if(modifiedList.remove(Integer.valueOf(elementToRemove)))
		{
			System.out.println(numbers);
			System.out.println(modifiedList);
		}
		else
		{
		System.out.println(elementToRemove + " not found");
        }
    }
}
