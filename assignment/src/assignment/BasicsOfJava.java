package assignment;

public class BasicsOfJava {
	
	public void myName() {
		String name="Atharva"; // name is local variable
		System.out.println("My name is " + name);
		
	}
      
	public static void main(String[] args) {

		int num1 = 11; // Integer
		float num2 = 1.23f; // Decimal number
		char alphabet = 'A'; // Character
		boolean tof = true; // Boolean
		String str = "Hello World"; // String
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(alphabet);
		System.out.println(tof);
		System.out.println(str);
		BasicsOfJava name1 = new BasicsOfJava();
		name1.myName();
	}

}
