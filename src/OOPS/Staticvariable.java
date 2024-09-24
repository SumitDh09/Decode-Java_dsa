package OOPS;



class Mobile{
    static String name;
    String brand;
    int price;

     void show(){
         System.out.println(brand+" : "+price+" : "+ name);


    }
}
public class Staticvariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand= "Apple";
        obj1.price= 1500;
        obj1.name="Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand= "Samsung";
        obj2.price= 1750;
        obj2.name="Smartphone";

        obj1.name= " phone";

        obj1.show();
        obj2.show();

    }

}
