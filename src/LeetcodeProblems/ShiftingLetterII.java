package LeetcodeProblems;

public class ShiftingLetterII {
    public static void main(String[] args) {
        ShiftingLetterII solution = new ShiftingLetterII();
        String s = "abc";
        int[][] shifts = {{0, 1, 1}, {1, 2, -1}};
        System.out.println("Shifted string is: " + solution.shiftingLetters(s, shifts));

        String s2 = "xyz";
        int[][] shifts2 = {{0, 2, 1}};
        System.out.println("Shifted string is: " + solution.shiftingLetters(s2, shifts2));
    }

    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftAmount = new int[n + 1];

        // Apply the shifts
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            int amount = direction == 1 ? 1 : -1;

            shiftAmount[start] += amount;
            if (end + 1 < n) {
                shiftAmount[end + 1] -= amount;
            }
        }

        // Calculate the prefix sum of shifts
        for (int i = 1; i < n; i++) {
            shiftAmount[i] += shiftAmount[i - 1];
        }

        // Apply the shifts to the string
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            int shift = shiftAmount[i] % 26;
            if (shift < 0) {
                shift += 26;
            }
            result[i] = (char) ((s.charAt(i) - 'a' + shift) % 26 + 'a');
        }

        return new String(result);
    }
}
