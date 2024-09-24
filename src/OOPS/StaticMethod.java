package OOPS;

class  JIophone {
    static String name;
    String brand;
    int price;

    public static void show1(JIophone obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name);
    }

    void show() {
        //instance method
        System.out.println(brand + " : " + price + " : " + name);


    }
}
public class StaticMethod {
    public static void main(String[] args) {
        JIophone obj1 = new JIophone();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1750;
        obj2.name = "Smartphone";

        obj1.name = " phone";

        obj1.show();
        obj2.show();


        JIophone.show1(obj1);

    }
}

