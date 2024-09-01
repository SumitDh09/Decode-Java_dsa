package Strings;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        char[] ch = new char[]{'r', 'a', 'j'};
        sb.append(ch);
        System.out.println(sb);
        sb.append("pqr");
        System.out.println(sb);
    }
}
