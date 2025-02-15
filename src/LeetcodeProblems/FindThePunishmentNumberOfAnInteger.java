package LeetcodeProblems;

public class FindThePunishmentNumberOfAnInteger {
    private int num;
    private String s;

    public static void main(String[] args) {
        FindThePunishmentNumberOfAnInteger solution = new FindThePunishmentNumberOfAnInteger();
        int n = 10; // You can change this value for different inputs
        System.out.println("The punishment number is : " + solution.punishmentNumber(n));
    }

    private boolean rec(int i, int rem, int sm) {
        if (i == s.length())
            return sm + rem == num;

        rem = rem * 10 + s.charAt(i) - '0';
        return rec(i + 1, 0, sm + rem) | rec(i + 1, rem, sm);
    }

    public int punishmentNumber(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            num = i;
            s = Integer.toString(i * i);
            ans += rec(0, 0, 0) ? i * i : 0;
        }
        return ans;
    }
}

