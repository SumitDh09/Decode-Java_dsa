package MultiDimensionalArray1;

public class Dutchalgo {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;
        int noOfzeroes = 0;
        int noOfones = 0;

        int i;
        for(i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                ++noOfzeroes;
            }

            if (arr[i] == 1) {
                ++noOfones;
            }
        }

        for(i = 0; i < n; ++i) {
            if (i < noOfzeroes) {
                arr[i] = 0;
            } else if (i < noOfzeroes + noOfones) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        for(i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}

