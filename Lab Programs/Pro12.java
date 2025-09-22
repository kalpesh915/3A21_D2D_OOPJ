package q28198;
import java.util.Scanner;
abstract class Vehicle {
	// write your code here
	 String model;

    public Vehicle(String model)
	{
        this.model = model;
    }
	public abstract void startEngine();
}
class Car extends Vehicle {
	// write your code here
	 public Car(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.println("Car model: " + model);
        System.out.println("Car engine started");
    }
	
	
}
class Motorcycle extends Vehicle {
	// write your code here
	 public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle model: " + model);
        System.out.println("Motorcycle engine started");
    }
	
	
}

public class VehicleTest {
    public static void main(String[] args) {
        // Taking input for Car
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model for the Car:");
        String carModel = scanner.nextLine();
        Vehicle car = new Car(carModel);
        car.startEngine();

        // Taking input for Motorcycle
        System.out.println("Enter the model for the Motorcycle:");
        String motorcycleModel = scanner.nextLine();
        Vehicle motorcycle = new Motorcycle(motorcycleModel);
        motorcycle.startEngine();

        // Close the scanner
        scanner.close();
    }
}
