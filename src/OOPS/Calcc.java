package OOPS;

class calculator {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("The sum is :: " + result);

    }
}

public class Calcc {
    public static void main(String[] args) {
            calculator c= new calculator();
            c.add(10,20);
    }
}
