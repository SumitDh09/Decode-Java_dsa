package Strings;
class MergeStringAlt {
        public static void main(String[] args) {
            MergeStringAlt merger = new MergeStringAlt();
            String mergedResult = merger.mergeStrings("hello", "world");
            System.out.println("Merged result: " + mergedResult);
        }

    //Leetcode 1768:--  You are given two strings word1 and word2.
    //Merge the strings by adding letters in alternating order,starting with word1.
    //If a string is longer than the other, append the additional letters onto the end of the merged string.
public String mergeAlternately(String k1, String k2) {
    final int n = Math.min(k1.length(), k2.length());
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; ++i) {
                sb.append(k1.charAt(i));
                sb.append(k2.charAt(i));
            }
            return sb.append(k1.substring(n)).append(k2.substring(n)).toString();
        }

        // New method for merging strings alternately
        public String mergeStrings(String s1, String s2) {
            // Similar logic as in mergeAlternately
            final int len1 = s1.length();
            final int len2 = s2.length();
            final int n = Math.min(len1, len2);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; ++i) {
                result.append(s1.charAt(i));
                result.append(s2.charAt(i));
            }
            return result.append(s1.substring(n)).append(s2.substring(n)).toString();
        }
}




