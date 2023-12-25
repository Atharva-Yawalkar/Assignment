package assignment;

class Animal {
 void eat() {
     System.out.println("Eating");
 }
 void run() {
	 System.out.println("Running");
 }
}

class Dog extends Animal {
 void bark() {
     System.out.println("Barking");
 }
}
// Dog class inherits eat and run method from Animal class
public class Inheritance {
	public static void main(String args[]) {
	     Dog d = new Dog();
	     d.bark();
	     d.eat();
	     d.run();
	 }
}
