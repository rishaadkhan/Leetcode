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
class Solution {
    public int maxDepth(TreeNode root) {
        int max = 0;
        if(root == null) return max;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depth = new Stack<>();
        stack.push(root);
        depth.push(1);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            int currD = depth.pop();
            if(curr.left != null){
                stack.push(curr.left);
                depth.push(currD + 1);
            }
            if(curr.right != null){
                stack.push(curr.right);
                depth.push(currD + 1);
            }
            max = Math.max(currD, max);

        }
        return max;

    }
}