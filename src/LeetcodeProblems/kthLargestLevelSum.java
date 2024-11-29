package LeetcodeProblems;


import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class kthLargestLevelSum {
    public static void main(String[] args) {
        TrEeNode root = new TrEeNode(5);
        root.left = new TrEeNode(8);
        root.right = new TrEeNode(9);
        root.left.left = new TrEeNode(2);
        root.left.right = new TrEeNode(1);
        root.right.left = new TrEeNode(3);
        root.right.right = new TrEeNode(7);
        root.left.left.left = new TrEeNode(4);
        root.left.left.right = new TrEeNode(6);

        kthLargestLevelSum solution = new kthLargestLevelSum();
        int k = 2;
        System.out.println("The " + k + "th largest level sum is: " + solution.kthLargestLevelSum(root, k));
    }

    public long kthLargestLevelSum(TrEeNode root, int k) {
        // BF
        // max heap
        //bfs - min heap.
        Queue<TrEeNode> queue = new LinkedList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0l;
            for(int i=0;i<size;i++){
                TrEeNode node = queue.poll();
                sum += node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            pq.offer(sum);
            if(pq.size()>k){
                pq.poll();
            }
        }
        //-1 case
        if(pq.size()<k){
            return -1;
        }
        return pq.peek();
    }
}
