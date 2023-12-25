package assignment;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee("Atharva", 72);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());

        // Changing employee details
        employee.setName("Kartik");
        employee.setId(97);
        System.out.println("Updated Employee Name: " + employee.getName());
        System.out.println("Updated Employee ID: " + employee.getId());
    }
}

