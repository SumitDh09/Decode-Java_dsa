package MergeSort;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
public class ReversePairsM2 {
    // A method for reversing pairs in the array and returning the count
    public int reversePairs(int[] nums) {
        // TreeSet to store unique numbers and their double values
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add((long) num);
            treeSet.add((long) num * 2);
        }
        // Mapping each unique number to its index position
        Map<Long, Integer> indexMapping = new HashMap<>();
        int index = 0;
        for (long num : treeSet) {
            indexMapping.put(num, ++index);
        }
        // Using a Binary Indexed Tree (Fenwick Tree) for maintaining prefix sums
        BinaryIndexedTree binaryIndexedTree = new BinaryIndexedTree(indexMapping.size());
        // The count of reverse pairs
        int count = 0;
        // Traverse the array from right to left
        for (int i = nums.length - 1; i >= 0; --i) {
            int x = indexMapping.get((long) nums[i]);
            // Query the count of elements smaller than the current number
            count += binaryIndexedTree.query(x - 1);
            // Update the count of elements which are double the current number
            binaryIndexedTree.update(indexMapping.get((long) nums[i] * 2), 1);
        }
        return count; // Return the total count of the reverse pairs
    }

    public static void main(String[] args) {
        ReversePairsM2 rp = new ReversePairsM2();
        int[] nums = {1, 3, 2, 3, 1};
        int count = rp.reversePairs(nums);
        System.out.println("Count of reverse pairs: " + count);
    }
}
// Class representing the Binary Indexed Tree (Fenwick Tree)
class BinaryIndexedTree {
    private int size; // Size of the tree
    private int[] tree; // Actual tree represented as an array
    // Constructor to initialize the tree with the given size
    public BinaryIndexedTree(int size) {
        this.size = size;
        tree = new int[size + 1]; // One extra index for easier calculations
    }
    // Method to update the tree with the given value (delta) at the given index (x)
    public void update(int index, int delta) {
        while (index <= size) {
            tree[index] += delta; // Add delta to the current index
            index += lowbit(index); // Move to the next index that needs to be updated
        }
    }
    // Method to query the prefix sum up to the given index (x)
    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index]; // Add the value at the current index to sum
            index -= lowbit(index); // Move to the parent index
        }
        return sum;
    }
    // Utility method to calculate the lowest bit (-x) of a number (x)
    public static int lowbit(int x) {
        return x & -x;
    }
}