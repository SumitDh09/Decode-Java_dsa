package Conditionals;

import java.util.Scanner;
public class Ageclac{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("check the age of 1st person :");
            int a = sc.nextInt();
            System.out.println("check the age of 2nd person :");
            int b = sc.nextInt();
            System.out.println("check the age of 3rd person :");
            int c = sc.nextInt();
            if (a < b) {
                if (a < c) {
                    System.out.println(a + "  is youngest :");
                } else {
                    System.out.println(c + "  is youngest :");
                }
            } else {
                if (b < c) {
                    System.out.println(b + "  is youngest :");
                } else {
                    System.out.println(c + " is youngest :");
                }

                sc.close();
            }

        }


}
