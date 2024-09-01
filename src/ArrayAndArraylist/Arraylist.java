package ArrayAndArraylist;


import java.io.PrintStream;
import java.util.ArrayList;

public class Arraylist {
    public Arraylist() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(6);
        arr.add(0, 10);
        arr.add(1, 120);
        arr.add(2, 20);
        arr.add(3, 23);
        arr.add(4, 43);
        arr.add(5, 25);
        System.out.println("Size of arr: " + arr.size());

        PrintStream var10000;
        Object var10001;
        int i;
        for(i = 0; i < arr.size(); ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print(var10001 + " ");
        }

        System.out.println();
        arr.set(2, 123);

        for(i = 0; i < arr.size(); ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print(var10001 + " ");
        }

        arr.add(98);
        System.out.println("\nUpdated size of arr: " + arr.size());

        for(i = 0; i < arr.size(); ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.println(var10001 + "  ");
        }

    }
}
