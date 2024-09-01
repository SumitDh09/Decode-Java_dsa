package Strings;

import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];

        int maxfreq;
        int i;
        for(maxfreq = 0; maxfreq < s.length(); ++maxfreq) {
            i = s.charAt(maxfreq);
            int idx = i - 97;
            int var10002 = freq[idx]++;
        }

        maxfreq = -1;

        for(i = 0; i < freq.length; ++i) {
            maxfreq = Math.max(maxfreq, freq[i]);
        }

        for(i = 0; i < freq.length; ++i) {
            if (freq[i] == maxfreq) {
                char ch = (char)(i + 97);
                System.out.println(ch + " ");
            }
        }

    }
}
