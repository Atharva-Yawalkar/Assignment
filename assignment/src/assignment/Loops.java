package assignment;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		
		// switch case
		System.out.println("Output from switch case:");
		switch(age) {
		case 15:
			System.out.println("You are in 10th grade");
			break;
		
		case 18:
			System.out.println("You are in 12th grade");
			break;
		
		case 22:
			System.out.println("You are joining a new company");
			break;
		default:
			System.out.println("None of the above");
		}
		
		// if else-if statements
		System.out.println("Output from if else-if statements:");
		if(age==15)
			System.out.println("You are in 10th grade");
		else if(age==18)
			System.out.println("You are in 12th grade");
		else if(age==22)
			System.out.println("You are joining a new company");
		else
			System.out.println("None of the above");
		
		sc.close();
		
		// for loop
		System.out.println("Output of for loop:");
		for(int j=0;j<=5;j++) {
			System.out.println(j);
		}
		
		
		// while loop
		int i=0;
		System.out.println("Output of while loop:");
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		
		// do-while loop
		int k=0;
		System.out.println("Output of do-while loop:");
		do {
			System.out.println(k);
			k++;
		}while(k<6);
		
	}

}
