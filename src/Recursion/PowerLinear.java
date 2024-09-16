package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static int pow(int n , int m ){
        if(m==0)
            return 1;// base case
        return n*pow(n,m-1); //call

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter base :-");
        int n = sc.nextInt();
        System.out.println(" Enter Power :-");
        int m = sc.nextInt();
        System.out.println(n+ " raised to the power "+m+" is "+pow(n,m));
    }
}
