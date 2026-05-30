package mon5date30;

//Superclass
class Animal {
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("The Cat meows");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("The Dog barks");
 }
}


public class AnimalTest {

	public static void main(String[] args) {
		 Animal a = new Animal();
	        Cat c = new Cat();
	        Dog d = new Dog();

	        a.makeSound();
	        c.makeSound();
	        d.makeSound();	}

}
