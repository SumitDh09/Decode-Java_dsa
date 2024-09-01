package ArrayAndArraylist;


import java.io.PrintStream;
import java.util.ArrayList;

public class Listinarray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
        list.add(60);
        var10000 = System.out;
        var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
        list.add(50);
        var10000 = System.out;
        var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
        list.add(205);
        var10000 = System.out;
        var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
        list.add(-45);
        var10000 = System.out;
        var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
        list.remove(1);
        var10000 = System.out;
        var10001 = String.valueOf(list);
        var10000.println(var10001 + " " + list.size());
    }
}
