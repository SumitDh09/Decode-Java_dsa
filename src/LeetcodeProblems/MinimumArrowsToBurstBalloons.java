package LeetcodeProblems;

import java.util.Arrays;

public class MinimumArrowsToBurstBalloons {
    public static void main(String[] args) {
        MinimumArrowsToBurstBalloons obj = new MinimumArrowsToBurstBalloons();
        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println("Minimum number of arrows needed : " + obj.findMinArrowShots(points1));
        // Expected output: 2

        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println("Minimum number of arrows needed : " + obj.findMinArrowShots(points2));
        // Expected output: 4

        int[][] points3 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println("Minimum number of arrows needed : " + obj.findMinArrowShots(points3));
        // Expected output: 2
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }


        // Sort the balloons by their end coordinates
        Arrays.sort(points, (a, b)
                -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}

