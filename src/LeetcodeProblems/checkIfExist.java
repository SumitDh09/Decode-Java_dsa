package LeetcodeProblems;


class CheckIfExist {
    public static void main(String[] args) {
        CheckIfExist checker = new CheckIfExist();  // Instantiate the correct class
        int[] arr = {10, 2, 5, 3};

        boolean result = checker.checkIfExist(arr);
        System.out.println(result);  // Output: true, because arr[0] (10) is double arr[2] (5)

        int[] arr2 = {3, 1, 7, 11};
        boolean result2 = checker.checkIfExist(arr2);
        System.out.println(result2);  // Output: false
    }

    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;  // Condition met
                }
            }
        }

        return false;  // No such pair found
    }
}