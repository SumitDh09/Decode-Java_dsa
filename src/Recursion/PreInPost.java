package Recursion;

public class PreInPost {
    public static void pip(int n) {
        if (n == 0)
            return;
        System.out.println("pre" +n);//pre
//        System.out.println(n);//pre
        pip(n - 1);
        System.out.println("in" +n);//in
//        System.out.println(n); //in
        pip(n - 1);
        System.out.println("post" +n);//post
//        System.out.println(n); //post
    }

    public static void main(String[] args) {
        pip(3);


    }

}
