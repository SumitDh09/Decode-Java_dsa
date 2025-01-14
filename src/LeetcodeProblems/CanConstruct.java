package LeetcodeProblems;

import java.util.Arrays;

class CanConstruct {
    public static void main(String[] args) {
        CanConstruct solution = new CanConstruct();
        String s = "aabbcc";
        int k = 2;
        boolean result = solution.canConstruct(s, k);
        System.out.println("Can construct: " + result);
    }

    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int oddCount = 0;

        for (int i = 0; i < chars.length; ) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            if (count % 2 != 0) oddCount++;
        }

        return oddCount <= k;
    }
}
