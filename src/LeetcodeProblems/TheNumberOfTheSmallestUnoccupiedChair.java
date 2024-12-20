package LeetcodeProblems;

import java.util.*;

public class TheNumberOfTheSmallestUnoccupiedChair {
    public static void main(String[] args) {
        TheNumberOfTheSmallestUnoccupiedChair solution = new TheNumberOfTheSmallestUnoccupiedChair();
        int[][] times = {{1, 4}, {2, 3}, {4, 6}};
        int targetFriend = 1;
        int result = solution.smallestChair(times, targetFriend);
        System.out.println("The smallest chair number for the target friend is: " + result);
    }

    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrival = times[targetFriend][0]; //[a,d]
        Arrays.sort(times, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0];
            }
        });
        //[lt,chairNo]
        PriorityQueue<int[]> occupied = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0];
            }
        });
        PriorityQueue<Integer> available = new PriorityQueue<>();
        int chairNo = 0;
        for (int time[] : times) {
            int arrTime = time[0];
            int leavingTime = time[1];
            while (!occupied.isEmpty() && occupied.peek()[0] <= arrTime) {
                available.offer(occupied.poll()[1]);
            }
            int currentChairNo;
            if (available.isEmpty()) {
                currentChairNo = chairNo;
                chairNo++;
            } else {
                currentChairNo = available.poll();
            }
            if (targetArrival == arrTime) return currentChairNo;
            occupied.offer(new int[]{leavingTime, currentChairNo});
        }
        return -1;
    }
}
