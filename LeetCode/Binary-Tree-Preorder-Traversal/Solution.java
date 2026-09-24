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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> ans=new ArrayList<>();
19        traverse(root,ans);
20        return ans;
21    }
22    public void traverse(TreeNode node, List<Integer> ans){
23        if (node==null) return;
24        ans.add(node.val);
25        traverse(node.left,ans);
26        traverse(node.right,ans);
27    }
28}