package LeetcodeProblems;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
        KeysAndRooms solution = new KeysAndRooms();

        // Example test case 1
        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1)); // Room 0 has key to Room 1
        rooms1.add(Arrays.asList(2)); // Room 1 has key to Room 2
        rooms1.add(Arrays.asList(3)); // Room 2 has key to Room 3
        rooms1.add(Arrays.asList());    // Room 3 has no keys
        System.out.println("Can visit all rooms (Test Case 1): " + solution.canVisitAllRooms(rooms1)); // Output: true

        // Example test case 2
        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1, 3));
        // Room 0 has keys to Room 1 and Room 3
        rooms2.add(Arrays.asList(3, 0));
        // Room 1 has keys to Room 3 and Room 0
        rooms2.add(Arrays.asList(2));
        // Room 2 has key to Room 2
        rooms2.add(Arrays.asList(0));
        // Room 3 has key to Room 0
        System.out.println("Can visit all rooms : " + solution.canVisitAllRooms(rooms2)); // Output: false

        // Example test case 3
        List<List<Integer>> rooms3 = new ArrayList<>();
        rooms3.add(Arrays.asList(1));
        // Room 0 has key to Room 1
        rooms3.add(Arrays.asList(2));
        // Room 1 has key to Room 2
        rooms3.add(Arrays.asList(3));
        // Room 2 has key to Room 3
        rooms3.add(Arrays.asList(4));
        // Room 3 has key to Room 4
        rooms3.add(Arrays.asList());
        // Room 4 has no keys
        System.out.println("Can visit all rooms (Test Case 3): " + solution.canVisitAllRooms(rooms3)); // Output: true
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        int visitedCount = 1;

        while (!queue.isEmpty()) {
            int room = queue.poll();
            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.offer(key);
                    visitedCount++;
                }
            }
        }

        return visitedCount == n;
    }
}