package LeetcodeProblems;

class MovePiecesToObtainAString {
    public static void main(String[] args) {
        MovePiecesToObtainAString solution = new MovePiecesToObtainAString();

        String start1 = "_L__R__R_";
        String target1 = "L______RR";
        System.out.println("Can change: " + solution.canChange(start1, target1)); // Expected output: true

        String start2 = "R_L_";
        String target2 = "__LR";
        System.out.println("Can change: " + solution.canChange(start2, target2)); // Expected output: false

        String start3 = "_R";
        String target3 = "R_";
        System.out.println("Can change: " + solution.canChange(start3, target3)); // Expected output: false
    }

    public boolean canChange(String start, String target) {
        if (start.equals(target)) {
            return true;
            // Two pointers
        }
        int waitL = 0;
        int waitR = 0;

        for (int i = 0; i < start.length(); i++) {
            char curr = start.charAt(i);
            char goal = target.charAt(i);

            if (curr == 'R') {
                if (waitL > 0) {
                    return false;
                }
                waitR++;
            }
            if (goal == 'L') {
                if (waitR > 0) {
                    return false;
                }
                waitL++;
            }
            if (goal == 'R') {
                if (waitR == 0) {
                    return false;
                }
                waitR--;
            }
            if (curr == 'L') {
                if (waitL == 0) {
                    return false;
                }
                waitL--;
            }
        }

        return waitL == 0 && waitR == 0;
    }
}
