package JavaEight;

public class Main {
    public static void main(String[] args) {
//        Shape s = new Square();
//        s.printName();
        //lambda
//        Shape s1 = () -> System.out.println(" I am Triangle ");
//        Shape s2 = () -> System.out.println(" I am Square ");
        Shape s3 = () -> {
            System.out.println(" I am Square ");
            System.out.println(" I am Rhombus ");
            System.out.println(" I am Rectangle ");
            System.out.println(" I am Trapezium ");
        };
//        s3.printName();
//        s1.printName();
//        s2.printName();
     /*   Calculator c = (a,b)->{

            return a*b;
        };
        System.out.println("Multiplication :-->" + c1solve(5,7));
*/
        //Add
        Calculator c1 = (a,b)->{
            return a+b;
        };
        System.out.println("Addition :->" + c1.solve(5,7));

        Number n1 = n-> {
          if (n%2==0){
              System.out.println("Even");
          }else {
              System.out.println("Odd");
          }
        };
        n1.printType(8);

    }
}
