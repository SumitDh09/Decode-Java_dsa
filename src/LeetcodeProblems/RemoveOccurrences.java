package LeetcodeProblems;

public class RemoveOccurrences {
    public static void main(String[] args) {
        RemoveOccurrences ro = new RemoveOccurrences();

        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        System.out.println(ro.removeOccurrences(s1, part1)); // Output: "dab"

        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        System.out.println(ro.removeOccurrences(s2, part2)); // Output: "ab"
    }

    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}

