package Strings;

public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = s;
        String c = "abc";
        c = c + "xyz";
        System.out.println(s == c);
        System.out.println(s.equals(b));
    }
}
