package Strings;

public class MutableString {
    public static void main(String[] args) {

        String name = "Sumit";
        //changing the address in stack
        name = name + "Dhondikar";

        System.out.println("hello" + name);

        String s1 = "Sumit";
        String s2 = "Dhondikar";
        System.out.println(s1 != s2);
        System.out.println(s1 == s2);
        // Mutable means change
        //by default string in immutable

    }

}
