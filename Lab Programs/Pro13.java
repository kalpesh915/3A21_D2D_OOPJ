package q27463;
import java.util.*;
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
interface Color {
    String getColor();
}
class Circle implements Shape, Color {
    private double radius;
    private String color;
    //write your code here
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String getColor() {
        return color;
    }
    
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Color of the circle: ");
        String color = scanner.nextLine();
        Circle circle = new Circle(radius, color);
        
        // Formatting double values to 2 decimal places
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.println("Circle Color: " + circle.getColor());
        
        scanner.close();
    }
}