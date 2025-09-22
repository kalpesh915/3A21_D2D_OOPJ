package q55519;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double D =(b*b)-4*a*c;

        if (D>0) {
            System.out.println("two distinct real roots");
            double res1=(-b+Math.sqrt(D))/(2*a);
			double res2=(-b-Math.sqrt(D))/(2*a);
			System.out.println("Root 1: "+res1);
			System.out.println("Root 2: "+res2);
        } else if (D==0) {
            System.out.println("one real root");
            double res1=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Root: "+res1);
        } else {
            System.out.println("no real roots");
        }

        scanner.close();
    }
}
