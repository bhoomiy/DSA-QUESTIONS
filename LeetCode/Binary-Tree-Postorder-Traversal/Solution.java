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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        Stack<TreeNode> st1=new Stack<>();
19        Stack<TreeNode> st2=new Stack<>();
20        List<Integer> postOrder=new ArrayList<>();
21
22        if(root==null) return postOrder;
23
24        st1.push(root);
25        while(!st1.isEmpty()){
26            root=st1.pop();
27            st2.push(root);
28            if(root.left!=null) st1.push(root.left);
29            if(root.right!=null) st1.push(root.right);
30        }
31        while(!st2.isEmpty()) postOrder.add(st2.pop().val);
32
33        return postOrder;
34    }
35}