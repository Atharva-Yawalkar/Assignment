package assignment;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class MapExample {
//	int n = 5;
//	class Student{
//		String sname;
//		int sid;
//		double smarks;
//		
//		Student(String sname, int sid, double smarks){
//			this.sname=sname;
//			this.sid=sid;
//			this.smarks=smarks;
//		}
//	}
//	
//	public static void main(String[] args) {
//		MapExample smap = new MapExample();
//		smap.addelements();
//	}
//	
//	public void addelements() {
//		Map<Student, Student> map = new HashMap<>();
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<n;i++) {
//			System.out.println("Enter the student name: ");
//			String sname=sc.next();
//			System.out.println("Enter the student id: ");
//			int sid=sc.nextInt();
//			System.out.println("Enter the student's total marks: ");
//			double smarks=sc.nextDouble();
//			Student student = new Student(sname, sid, smarks);
//			map.put(student, student);
//		}
//		System.out.println("Map Elements:");
//		printMap(map);
//		System.out.println("Enter the student id to delete: ");
//		int sid=sc.nextInt();
//		map.keySet().removeIf(student -> student.sid == sid);
//		System.out.println("Map Elements After Deletion:");
//		printMap(map);
//	}
//	
//	public void printMap(Map<Student, Student> map) {
//		for(Map.Entry<Student, Student> entry : map.entrySet()) {
//			Student student = entry.getKey();
//			System.out.println(student.sname + " " + student.sid + " " + student.smarks);
//		}
//	}
//}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

   public static void main(String[] args) {
      Map<String, String> m1 = new HashMap<>(); 
      Scanner sc = new Scanner(System.in);
      
      for(int i=0; i<4; i++) {
         System.out.println("Enter key: ");
         String key = sc.next();
         System.out.println("Enter value: ");
         String value = sc.next();
         m1.put(key, value);
      }
      
      System.out.println();
      System.out.println("Map Elements:");
      System.out.println(m1);
	  
      System.out.println("Enter key to remove: ");
      String keyToRemove = sc.next();
      m1.remove(keyToRemove);
      System.out.println("Map Elements:");
      System.out.println(m1);
      sc.close();
   }
}
