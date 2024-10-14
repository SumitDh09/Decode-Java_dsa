package OOPS;

class Car {
    public static Car object2;
    int speed;
    String color;
    String brand;
    Boolean isABSPresent;

    Car(int speed, String color, String brand, Boolean isAbs) {
        System.out.println("init");
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        this.isABSPresent = isAbs;
        System.out.println("init done");
    }

    Car(Car object2) {
        System.out.println("This is default");
        this.color = "blue";
        this.brand = "Maruti";
        this.speed = 80;
        this.isABSPresent = false;
    }

    public void Drive() {
        System.out.println("Driving");
    }

    public void SpeedUp(int newSpeed) {
        speed = newSpeed;
        System.out.println("Speed up");
    }
}

public class Mainn {
    public static void main(String[] args) {
        Car object = new Car(Car.object2);
        System.out.println("speed: " + object.speed);

        Car.object2 = new Car(100, "black", "Ford", true);
        System.out.println("Speed: " + Car.object2.speed);

        Car object3 = new Car(Car.object2);  // Corrected constructor call
        System.out.println("speed: " + object3.speed);

        Car.object2.speed = 90;
        System.out.println("speed: " + Car.object2.speed);
        System.out.println("speed: " + object3.speed);

        // same reference -> shallow copy
        Car object4 = Car.object2;
        System.out.println("object 2 speed: " + Car.object2.speed);
        System.out.println("object 4 speed: " + object4.speed);

        Car.object2.speed = 120;
        System.out.println("object 2 speed: " + Car.object2.speed);
        System.out.println("object 4 speed: " + object4.speed);
    }
}
