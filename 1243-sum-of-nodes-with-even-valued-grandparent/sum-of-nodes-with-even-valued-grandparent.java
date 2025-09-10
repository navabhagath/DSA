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
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr.val % 2 == 0){
                if(curr.left!=null){
                    sum += helper(curr.left.left);
                    sum += helper(curr.left.right);
                }
                if(curr.right != null){
                    sum += helper(curr.right.left);
                    sum += helper(curr.right.right);
                }
            }
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return sum;
    }
    public int helper(TreeNode root){
        return root == null ? 0 : root.val; 
    }
}