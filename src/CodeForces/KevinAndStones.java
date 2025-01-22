package CodeForces;

import java.util.*;

public class KevinAndStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for (int i = 0; i < testCases; i++) {
            int vertices = input.nextInt();
            int edges = input.nextInt();
            String initialState = input.next();
            String targetState = input.next();

            List<Integer>[] adjacencyList = new ArrayList[vertices + 1];
            for (int j = 1; j <= vertices; j++) {
                adjacencyList[j] = new ArrayList<>();
            }

            for (int j = 0; j < edges; j++) {
                int startVertex = input.nextInt();
                int endVertex = input.nextInt();
                adjacencyList[startVertex].add(endVertex);
                adjacencyList[endVertex].add(startVertex);
            }

            if (isValidSequence(vertices, initialState, targetState, adjacencyList)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        input.close();
    }

    private static boolean isValidSequence(int vertices, String initialState, String targetState, List<Integer>[] adjacencyList) {
        int[] initial = new int[vertices + 1];
        int[] target = new int[vertices + 1];

        for (int i = 0; i < vertices; i++) {
            initial[i + 1] = initialState.charAt(i) - '0';
            target[i + 1] = targetState.charAt(i) - '0';
        }

        int initialCount = 0;
        int targetCount = 0;

        for (int i = 1; i <= vertices; i++) {
            if (initial[i] == 1) initialCount++;
            if (target[i] == 1) targetCount++;
        }

        if (initialCount != targetCount) return false;

        boolean[] visited = new boolean[vertices + 1];
        for (int i = 1; i <= vertices; i++) {
            if (!visited[i] && initial[i] != target[i]) {
                if (!depthFirstSearch(i, initial, target, adjacencyList, visited)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean depthFirstSearch(int node, int[] initial, int[] target, List<Integer>[] adjacencyList, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjacencyList[node]) {
            if (!visited[neighbor]) {
                if (initial[node] == 1 && target[neighbor] == 1) {
                    initial[node] = 0;
                    target[neighbor] = 0;
                    if (depthFirstSearch(neighbor, initial, target, adjacencyList, visited)) {
                        return true;
                    }
                    initial[node] = 1;
                    target[neighbor] = 1;
                } else if (initial[neighbor] == 1 && target[node] == 1) {
                    initial[neighbor] = 0;
                    target[node] = 0;
                    if (depthFirstSearch(neighbor, initial, target, adjacencyList, visited)) {
                        return true;
                    }
                    initial[neighbor] = 1;
                    target[node] = 1;
                }
            }
        }

        return false;
    }
}
