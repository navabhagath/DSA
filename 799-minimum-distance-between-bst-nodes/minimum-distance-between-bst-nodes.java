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
    public int minDiffInBST(TreeNode root) {
        int ans = Integer.MAX_VALUE;
        List<Integer>al=new ArrayList<>();
        in(root,al);
        for(int i=1;i<al.size();i++){
            ans = Math.min(ans,Math.abs(al.get(i)-al.get(i-1)));
        }
        return ans;
    }
    public void in(TreeNode root,List<Integer>al){
        if(root==null) return;
        in(root.left,al);
        al.add(root.val);
        in(root.right,al);
    }
}