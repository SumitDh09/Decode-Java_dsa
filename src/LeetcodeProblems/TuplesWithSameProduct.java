package LeetcodeProblems;

import java.util.*;

public class TuplesWithSameProduct {

    public static void main(String[] args) {
        TuplesWithSameProduct solution = new TuplesWithSameProduct();
        int[] nums = {2, 3, 4, 6};
        System.out.println(solution.tupleSameProduct(nums));  // Output: 8
    }

    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) / 2;
            }
        }

        return count * 8;
    }

}
