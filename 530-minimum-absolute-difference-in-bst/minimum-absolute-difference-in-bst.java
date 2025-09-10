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
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        List<Integer>al = new ArrayList<>();
        inorder(root,al);
        for(int i=0;i<al.size()-1;i++){
            ans = Math.min(ans,Math.abs(al.get(i) - al.get(i+1)));
        }
        return ans;
    }
    public void inorder(TreeNode root,List<Integer>al){
        if(root==null){
            return;
        }
        inorder(root.left,al);
        al.add(root.val);
        inorder(root.right,al);
    }
      
}