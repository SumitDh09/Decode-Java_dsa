package LeetcodeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        Dota2Senate obj = new Dota2Senate();
        String senate1 = "RD";
        String senate2 = "RDD";

        System.out.println("Winner for senate1: " + obj.predictPartyVictory(senate1)); // Expected output: "Radiant"
        System.out.println("Winner for senate2: " + obj.predictPartyVictory(senate2)); // Expected output: "Dire"
    }

    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIndex = radiant.poll();
            int dIndex = dire.poll();
            if (rIndex < dIndex) {
                radiant.add(rIndex + n);
            } else {
                dire.add(dIndex + n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
