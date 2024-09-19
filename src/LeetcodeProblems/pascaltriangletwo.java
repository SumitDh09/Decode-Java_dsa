
package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangletwo {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1); 
            
            
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        
        return row;
    }

    public static void main(String[] args) {
        pascaltriangletwo solution = new pascaltriangletwo();
        int rowIndex = 3; // Change this to get the row at different indices
        List<Integer> row = solution.getRow(rowIndex);
        System.out.println("Row " + rowIndex + " of Pascal's triangle: " + row);
    }
}

    