package LeetcodeProblems;


class CanSortArrayII {
    public static void main(String[] args) {
        CanSortArrayII obj = new CanSortArrayII();
        int[] nums1 = {8, 4, 2, 30, 15};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {3, 16, 8, 4, 2};

        System.out.println("Can nums1 be sorted? " + obj.canSortArray(nums1)); // Expected output: true
        System.out.println("Can nums2 be sorted? " + obj.canSortArray(nums2)); // Expected output: true
        System.out.println("Can nums3 be sorted? " + obj.canSortArray(nums3)); // Expected output: false
    }

    public boolean canSortArray(int[] nums) {
        // Divide the array into distinct segments where each segment comprises
        //  consecutive elements sharing an equal number of set bits. Ensure that
        // for each segment, when moving from left to right, the maximum of a
        // preceding segment is less than the minimum of the following segment.
        int prevSetBits = 0;
        int prevMax = Integer.MIN_VALUE; // the maximum of the previous segment
        int currMax = Integer.MIN_VALUE; // the maximum of the current segment
        int currMin = Integer.MAX_VALUE; // the minimum of the current segment

        for (final int num : nums) {
            final int setBits = Integer.bitCount(num);
            if (setBits != prevSetBits) { // Start a new segment.
                if (prevMax > currMin)
                    return false;
                prevSetBits = setBits;
                prevMax = currMax;
                currMax = num;
                currMin = num;
            } else { // Continue with the current segment.
                currMax = Math.max(currMax, num);
                currMin = Math.min(currMin, num);
            }
        }

        return prevMax <= currMin;
    }
}
