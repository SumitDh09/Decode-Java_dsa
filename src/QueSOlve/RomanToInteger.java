package QueSOlve;

public class RomanToInteger {
    public static String intToRoman(int num) {
        //  arrays using for  Roman number and their corresponding values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Convert the integer to Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int number = 27; // Example number
        System.out.println("Roman numeral of " + number + " is " + intToRoman(number));
    }
}
