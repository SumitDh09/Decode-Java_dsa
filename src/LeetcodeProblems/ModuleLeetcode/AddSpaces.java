package LeetcodeProblems.ModuleLeetcode;

public class AddSpaces {
    public static void main(String[] args) {
        AddSpaces solution = new AddSpaces();

        String s1 = "EnjoyYourCoffee";
        int[] spaces1 = {5, 9};
        System.out.println("Modified string : " + solution.addSpaces(s1, spaces1)); // Expected output: "Enjoy Your Coffee"

        String s2 = "LeetcodeHelpsMeLearn";
        int[] spaces2 = {8, 13, 15};
        System.out.println("Modified string : " + solution.addSpaces(s2, spaces2)); // Expected output: "Leetcode Helps Me Learn"

        String s3 = "Icodeinpython";
        int[] spaces3 = {1, 5, 7, 9};
        System.out.println("Modified string : " + solution.addSpaces(s3, spaces3)); // Expected output: "I code in py thon"
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(' ');
                spaceIndex++;
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
