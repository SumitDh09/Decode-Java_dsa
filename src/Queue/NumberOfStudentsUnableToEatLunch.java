package Queue;

class NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch solution = new NumberOfStudentsUnableToEatLunch();
        int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println("Number of students unable to eat lunch : " + solution.countStudents(students1, sandwiches1)); // Expected output: 0

        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println("Number of students unable to eat lunch : " + solution.countStudents(students2, sandwiches2)); // Expected output: 3
    }

//    Leetcode 1700
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0;
        int zeroes = 0;
        for (int stud : students) {
            if (stud == 0)
                zeroes++;
            else
                ones++;
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeroes == 0)
                    return ones;
                else
                    zeroes--;
            } else if (sandwich == 1) {
                if (ones == 0)
                    return zeroes;
                else
                    ones--;
            }
        }
        return 0;
        /*
        TC O(N)
        SC O(1)
         */
    }
}
