package Project;

public class Patient {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Patient ID: " + this.id + ", Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender;
    }
}

