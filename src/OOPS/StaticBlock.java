package OOPS;

class Smartphone {
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    String brand;
    int price;
    String network;

    public Smartphone() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // This will trigger the static block of Smartphone class
        Class.forName("OOPS.Smartphone");

        // Uncomment and use these lines if you want to create instances and test the show method
        // Smartphone obj1 = new Smartphone();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Smartphone.name = "SmartPhone";
        // obj1.show();

        // Smartphone obj2 = new Smartphone();
        // obj2.show();
    }
}
