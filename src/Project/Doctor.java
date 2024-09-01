package Project;

public class Doctor {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String specility;

    public Doctor(String name, String specility) {
        this.id = ++idCounter;
        this.name = name;
        this.specility = specility;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Doctor ID: " + this.id + ", Name:" + this.name + ", Specility:" + this.specility;
    }
}
