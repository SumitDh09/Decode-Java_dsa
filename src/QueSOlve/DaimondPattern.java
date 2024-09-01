package QueSOlve;

public class DaimondPattern {
    public static void main(String[] args) {
        int rows=5;
        //upper half of the daimond
        for (int i = 0; i <=rows; i++) {
            for (int j = rows; j>i; j--) {
                System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");

            }
            System.out.println();

        }
        //lower half od the daimond
        for(int i=rows-1;i>=1;i--){
            for (int j=rows-1;j>=i;j--){
                System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
