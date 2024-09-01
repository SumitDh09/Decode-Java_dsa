package ArrayAndArraylist;


import java.util.ArrayList;

public class shortarraylist {


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(6);
        arr.add(0, 15);
        arr.add(1, 25);
        arr.add(2, 115);
        arr.add(3, 10);
        arr.add(4, 151);
        arr.add(5, 215);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2, 254);
        System.out.println(arr);
        arr.add(87);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}

