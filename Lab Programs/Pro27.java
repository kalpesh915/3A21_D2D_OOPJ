package q29082;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExamScoreManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> examScores = new ArrayList<>();

	// write the code..
		while(true)
			{
				int n=scanner.nextInt();
				if(n<0)
				{
					break;
				}
				else
				{
					examScores.add(n);
				}
			}
		Collections.sort(examScores);
		for(int i=0;i<examScores.size()-1;i++)
		{
			System.out.print(examScores.get(i)+" ");
		}
		System.out.println(examScores.get(examScores.size()-1));
    }
}
