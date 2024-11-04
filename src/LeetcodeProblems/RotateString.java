package LeetcodeProblems;

public class RotateString {
    public static void main(String[] args) {
        RotateString obj = new RotateString();
        String s1 = "abcde";
        String goal1 = "cdeab";
        String s2 = "abcde";
        String goal2 = "abced";

        System.out.println("Can s1 become goal1? " + obj.rotateString(s1, goal1)); // Expected output: true
        System.out.println("Can s2 become goal2? " + obj.rotateString(s2, goal2)); // Expected output: false
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String combined = s + s;
        return combined.contains(goal);
    }
}

