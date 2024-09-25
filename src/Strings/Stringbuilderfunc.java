package Strings;

public class Stringbuilderfunc {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcxd" + "uhius");
        StringBuilder tb = new StringBuilder("chomu");
        System.out.println(sb.length());
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());
    }

}
