package Strings;


import java.util.Scanner;
public class Countvowels {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter a string :");
            String s = sc.nextLine();
            int n = s.length();
            int count = 0;

            for (int i = 0; i < n; ++i) {
                char ch = s.charAt(i);
                if (isVowel(ch)) {
                    ++count;
                }
            }

            System.out.println(count);
        }

        public static boolean isVowel(char ch) {
            if (ch != 'a' && ch != 'A') {
                if (ch != 'e' && ch != 'E') {
                    if (ch != 'i' && ch != 'I') {
                        if (ch != 'o' && ch != 'O') {
                            return ch == 'u' || ch == 'U';
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }

}
