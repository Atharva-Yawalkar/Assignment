package assignment;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class SetExample {
	int n = 5;
	class StudentSet {
		String sname;
		int sid;
		double smarks;
		
		StudentSet(String sname, int sid, double smarks){
			this.sname=sname;
			this.sid=sid;
			this.smarks=smarks;
		}
	}
	
	public static void main(String[] args) {
		SetExample sset = new SetExample();
		sset.addelements();
	}
	
	public void addelements() {
		Set<StudentSet> set = new TreeSet<>(new Comparator<StudentSet>() {
			@Override
			public int compare(StudentSet s1, StudentSet s2) {
				return s1.sid - s2.sid;
			}
		});
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.println("Enter the student name: ");
			String sname=sc.next();
			System.out.println("Enter the student id: ");
			int sid=sc.nextInt();
			System.out.println("Enter the student's total marks: ");
			double smarks=sc.nextDouble();
			set.add(new StudentSet(sname, sid, smarks));
		}
		sc.close();
		System.out.println("Set Elements:");
		printSet(set);
	}
	
	public void printSet(Set<StudentSet> set) {
		for(StudentSet student : set) {
			System.out.println(student.sname + " " + student.sid + " " + student.smarks);
		}
	}
}