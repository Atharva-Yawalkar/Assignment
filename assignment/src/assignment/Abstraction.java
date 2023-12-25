package assignment;

abstract class Student {
    private String name;
    private int regNo;

    public Student(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public abstract void study();

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }
}

class EngineeringStudent extends Student {
    public EngineeringStudent(String name, int regNo) {
        super(name, regNo);
    }

    @Override
    public void study() {
        System.out.println("Engineering Student is studying.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Student student = new EngineeringStudent("Atharva", 72);
        student.study();
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll No: " + student.getRegNo());
    }
}

