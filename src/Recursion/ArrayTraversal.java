package Recursion;

public class ArrayTraversal {
    public static void print(int i ,  int[] arr){
        if (i==arr.length)
            return;
        System.out.print(i+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 7, 8, 3, 9,};
        print(0,arr);
    }
}
