package ArrayAndArraylist;


import java.io.PrintStream;
import java.util.ArrayList;

public class arraylist2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(6);
        arr.add(0, 15);
        arr.add(1, 25);
        arr.add(2, 115);
        arr.add(3, 10);
        arr.add(4, 151);
        arr.add(5, 215);
        System.out.println(arr.size());

        PrintStream var10000;
        Object var10001;
        int i;
        for(i = 0; i <= 5; ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print(var10001 + " ");
        }

        System.out.println();
        arr.set(2, 241);

        for(i = 0; i < arr.size(); ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print(var10001 + " ");
        }

        arr.add(98);
        System.out.println();
        System.out.println(arr.size());

        for(i = 0; i < arr.size(); ++i) {
            var10000 = System.out;
            var10001 = arr.get(i);
            var10000.print(var10001 + " ");
        }

    }
}
