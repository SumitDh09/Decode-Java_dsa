package OOPS;

class Calculate {
    public void add(int a, int b) {
        System.out.println("int-int argument");
    }

    public void add(float a, float b) {
        System.out.println("float-float argument");
    }

    public void add(double a, double b) {
        System.out.println("double-double argument");
    }
}

public class Calculator extends Calculate {
    public static void main(String[] args) {
        Calculate ca = new Calculate();
        ca.add(10, 20); // int-int
        ca.add(10.5f, 20.5f); // float-float
        ca.add(10.0, 20.0); // double-double
    }

}