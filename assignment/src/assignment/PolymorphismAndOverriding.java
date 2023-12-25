package assignment;

class Vehicle {

	void status() {
		System.out.println("The vehicle is running");
	}
}


class Bike extends Vehicle {
	@Override
	void status() {
		System.out.println("The bike is running");
	}
}


class Car extends Vehicle {
	@Override
	void status() {
		System.out.println("The car is running");
	}
}

public class PolymorphismAndOverriding {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(); 
		Vehicle b1 = new Bike(); 
		Vehicle c1 = new Car(); 

		v1.status();
		b1.status();
		c1.status();
	}
}

