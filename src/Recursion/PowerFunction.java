package Recursion;

import java.util.Scanner;

public class PowerFunction {
    public static int pow(int n , int m ){
//        if(n==0 || m==0) {
//            System.out.println("Not defined ");
//            return -1;// base case
//        }
        if (m==0)// t.c. 0(log b)
            return 1;
        return n*pow(n,m-1); //call

    }
    public static int pow2(int n , int m ){
        if (m==0)
            return 1;
        int ans =pow2(n,m/2);
        if (m%2==0)return ans*ans;
        else return ans*ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter base :-");
        int n = sc.nextInt();
        System.out.println(" Enter Power :-");
        int m = sc.nextInt();
        System.out.println(n+ " raised to the power "+m+" is "+pow2(n,m));
    }
}