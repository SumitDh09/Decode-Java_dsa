package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int Maze(int row , int col , int n , int m ){
        if (row ==n || col == m)
            return  1;
//        if (row ==n && col == m)
//            return  1;
//        if (row > m || col >n)
//            return 1;
        int rightWays = Maze(row, col+1, n, m);
        int downWays = Maze(row+1, col,n,m);
        return rightWays + downWays;
    }
    public static int Maze2(int n , int m ){
        if (n ==1 || m == 1)
            return  1;
        int rightWays = Maze2(n,m--);
        int downWays = Maze2(n--,m);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        System.out.println(Maze(1,1,m,n));
    }
}
