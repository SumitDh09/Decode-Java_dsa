package OOPS;

class Employee {
    // Instance variables
    String name;
    int age;

    // Zero-argument constructor
    Employee() {
        System.out.println("Employee constructor called");
    }

    // Instance method
    public void disp() {
        System.out.println("Name is :: " + name);
        System.out.println("Age is :: " + age);
    }
}

public class testap {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.disp();
    }
}
