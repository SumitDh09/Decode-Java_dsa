package OOPS;
import OOPS.StudentApp;


class Person {
    public String name;
    public String address;
    public int age;
}

class student extends Person {
    public int marks;
    public String grade;

    student(String name, String address, int age, int marks, String grade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp() {
        System.out.println("Name is :: " + name);
        System.out.println("Address is :: " + address);
        System.out.println("Marks is :: " + marks);
        System.out.println("Grade is :: " + grade);
    }
}

class Test {
    public static void main(String[] args) {
        student student = new student("sachin", "MI", 51, 100, "A");
        student.disp();
    }
}
