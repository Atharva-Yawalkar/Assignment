package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListExample {
	int n = 5;
	class StudentList implements Comparable<StudentList>{
		String sname;
		int sid;
		double smarks;
		
		StudentList(String sname, int sid, double smarks){
			this.sname=sname;
			this.sid=sid;
			this.smarks=smarks;
		}

		@Override
		public int compareTo(StudentList student) {
			return this.sid - student.sid;
		}
	}
	
	public static void main(String[] args) {
		ListExample slist = new ListExample();
		slist.addelements();
	}
	
	public void addelements() {
		ArrayList<StudentList> arraylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Enter the student name: ");
			String sname=sc.next();
			System.out.println("Enter the student id: ");
			int sid=sc.nextInt();
			System.out.println("Enter the student's total marks: ");
			double smarks=sc.nextDouble();
			arraylist.add(new StudentList(sname, sid, smarks));
		}
		sc.close();
		System.out.println("Original List:");
		printList(arraylist);
		Collections.sort(arraylist);
		System.out.println("Sorted List:");
		printList(arraylist);
	}
	
	public void printList(ArrayList<StudentList> arraylist) {
		for(int i=0;i<n;i++) {
			StudentList student = arraylist.get(i);
			System.out.println(student.sname + " " + student.sid + " " + student.smarks);
		}
	}
}
