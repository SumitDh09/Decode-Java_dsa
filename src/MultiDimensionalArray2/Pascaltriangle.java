package MultiDimensionalArray2;

import java.util.ArrayList;
import java.util.Iterator;

public class Pascaltriangle{
    public static void main(String[] args) {
        int numRows = 5;
        ArrayList<ArrayList<Integer>> triangle = generatePascalTriangle(numRows);
        Iterator var3 = triangle.iterator();

        while(var3.hasNext()) {
            ArrayList<Integer> row = (ArrayList)var3.next();
            Iterator var5 = row.iterator();

            while(var5.hasNext()) {
                Integer number = (Integer)var5.next();
                System.out.print(number + " ");
            }

            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList();
        if (numRows <= 0) {
            return triangle;
        } else {
            ArrayList<Integer> firstRow = new ArrayList();
            firstRow.add(1);
            triangle.add(firstRow);

            for(int i = 1; i < numRows; ++i) {
                ArrayList<Integer> prevRow = triangle.get(i - 1);
                ArrayList<Integer> row = new ArrayList();
                row.add(1);

                for(int j = 1; j < i; ++j) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }

                row.add(1);
                triangle.add(row);
            }

            return triangle;
        }
    }
}

