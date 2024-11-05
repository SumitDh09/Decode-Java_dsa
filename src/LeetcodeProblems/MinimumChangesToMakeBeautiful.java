package LeetcodeProblems;


public class MinimumChangesToMakeBeautiful {
    public static void main(String[] args) {
        MinimumChangesToMakeBeautiful obj = new MinimumChangesToMakeBeautiful();
        String s1 = "1001";
        String s2 = "10";
        String s3 = "0000";

        System.out.println("Minimum changes for s1: " + obj.minChanges(s1)); // Expected output: 2
        System.out.println("Minimum changes for s2: " + obj.minChanges(s2)); // Expected output: 1
        System.out.println("Minimum changes for s3: " + obj.minChanges(s3)); // Expected output: 0
    }

    public int minChanges(String s) {
        int n = s.length();
        int changes = 0;

        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }

        return changes;
    }
}
