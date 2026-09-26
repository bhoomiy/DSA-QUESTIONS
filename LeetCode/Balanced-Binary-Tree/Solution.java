1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isBalanced(TreeNode root) {
18        return checkHeight(root) != -1;
19    }
20    private int checkHeight(TreeNode node) {
21        if(node==null) return 0;
22        int lh=checkHeight(node.left);
23        // Left is already unbalanced → STOP
24        if (lh == -1) return -1;
25        int rh=checkHeight(node.right);
26        // Right is already unbalanced → STOP
27        if (rh == -1) return -1;
28        if(Math.abs(lh-rh)>1) return -1;
29        return 1+Math.max(lh,rh);
30	}
31}