package Methods;
class Calculator{
    public int add(int n1, int n2, int n3){
         return n1+n2+n3;

    }
    public  int add1(int n1, int n2){
        return n1+n2;
    }
    public  double add1(double n1, int n2){
        return n1+n2;
    }
}
public class My {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(3,2,5);
        System.out.println(r1);
    }
}
