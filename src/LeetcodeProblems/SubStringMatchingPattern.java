package LeetcodeProblems;

public class SubStringMatchingPattern {
    public static void main(String[] args) {
        SubStringMatchingPattern solution = new SubStringMatchingPattern();
        String s = "hello";
        String p = "he*lo";
        System.out.println("Pattern match: " + solution.hasMatch(s, p));

        String s2 = "world";
        String p2 = "wo*ld";
        System.out.println("Pattern match: " + solution.hasMatch(s2, p2));
    }

    public boolean hasMatch(String s, String p) {
        int idx = p.indexOf("*");

        int b = s.indexOf(p.substring(0, idx));
        int a = s.indexOf(p.substring(idx + 1), b + idx);

        if (b != -1 && a != -1) return true;
        return false;
    }
}
