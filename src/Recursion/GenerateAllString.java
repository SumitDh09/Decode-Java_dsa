package Recursion;

import java.util.Scanner;

public class GenerateAllString {
    //generate all binary string of length n without consecutive 1's
    // 000  001  010  100  010  100  110  101  011   111
    public static void printStrings(String s , int n ){

        int m = s.length();
        if (m==n){
            System.out.println(s);
            return;
        }
        printStrings(s+0,n);
        printStrings(s+1,n);
//        if (m==0 || s.charAt(m-1)=='0'){
//            printStrings(s+0,n);
//            printStrings(s+1,n);
//        }
//        else
//            printStrings(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStrings(" ",n);
    }

}