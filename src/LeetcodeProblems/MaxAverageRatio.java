package LeetcodeProblems;

import java.util.PriorityQueue;

public class MaxAverageRatio {
    public static void main(String[] args) {
        MaxAverageRatio solution = new MaxAverageRatio();
        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        double result = solution.maxAverageRatio(classes, extraStudents);
        System.out.println("Maximum Average Pass Ratio : " + result);
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        // Calculate initial gain for each class and add to max heap
        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            double initialRatio = (double) pass / total;
            double gain = (double) (pass + 1) / (total + 1) - initialRatio;
            maxHeap.offer(new double[]{gain, pass, total});
        }

        // Assign extra students to maximize the average pass ratio
        for (int i = 0; i < extraStudents; i++) {
            double[] top = maxHeap.poll();
            double gain = top[0];
            int pass = (int) top[1];
            int total = (int) top[2];
            pass++;
            total++;
            double newGain = (double) (pass + 1) / (total + 1) - (double) pass / total;
            maxHeap.offer(new double[]{newGain, pass, total});
        }

        // Calculate the final average pass ratio
        double totalRatio = 0;
        for (double[] c : maxHeap) {
            totalRatio += c[1] / c[2];
        }

        return totalRatio / classes.length;
    }
}

