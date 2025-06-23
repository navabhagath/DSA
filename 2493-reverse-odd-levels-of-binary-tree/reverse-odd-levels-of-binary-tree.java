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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left,root.right,0);
        return root;
    }
    public static void helper(TreeNode l,TreeNode r,int lvl){
        if(l == null || r == null) {
            return;
        }
        if(lvl%2==0){
            int temp = l.val;
            l.val = r.val;
            r.val = temp;
        }
        helper(l.left,r.right,lvl+1);
        helper(r.left,l.right,lvl+1);
    }
}