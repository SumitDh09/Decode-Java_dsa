package MultiDimensionalArray2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchA2Darrays {


    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> flattened = new ArrayList<>();

        // Flatten the 2D array into a 1D list
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                flattened.add(arr[i][j]);
            }
        }

        k %= flattened.size(); // Normalize k to avoid unnecessary rotations
        List<Integer> rotated = new ArrayList<>();

        // Create the rotated list
        for (int i = flattened.size() - k; i < flattened.size(); ++i) {
            rotated.add(flattened.get(i));
        }

        for (int i = 0; i < flattened.size() - k; ++i) {
            rotated.add(flattened.get(i));
        }

        // Convert the rotated list back to a 2D grid
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < m; ++i) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; ++j) {
                row.add(rotated.get(index));
                ++index;
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        SearchA2Darrays solution = new SearchA2Darrays();
        List<List<Integer>> shiftedGrid = solution.shiftGrid(arr, k);
        Iterator<List<Integer>> var5 = shiftedGrid.iterator();

        while (var5.hasNext()) {
            List<Integer> row = var5.next();
            System.out.println(row);
        }
    }
}