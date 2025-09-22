package q60854;
class Animal {
    public Animal()
	{
		System.out.println("Animal is created");
	}
	// Method eat in Animal class
    void eat()
	{
		System.out.println("Eating something");

}
}

class Dog extends Animal {
   public Dog()
	{
        super();
        System.out.println("Dog is created");
    }
    void eat()
	{
        System.out.println("Eating bread");
    }
	
    void bark()
	{
        System.out.println("Barking");
    }
    void work() {
        super.eat();  
        eat();         
        bark();       
	}
}

public class ExampleOnSuper {
    public static void main(String args[]) {
        // Create an object of Dog class
        Dog d = new Dog();
        
        // Call the work method on the Dog object
        d.work();
    }
}
