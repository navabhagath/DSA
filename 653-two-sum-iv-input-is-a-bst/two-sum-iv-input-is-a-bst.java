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
    public void inOrder(TreeNode root, List<Integer>al){
        if(root == null){
            return;
        }
        inOrder(root.left,al);
        al.add(root.val);
        inOrder(root.right,al);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>al = new ArrayList<>();
        inOrder(root,al);
        int p1=0,p2=al.size()-1;
        while(p1<p2){
            int sum = al.get(p1) + al.get(p2);
            if(sum == k){
                return true;
            }else if(sum < k){
                p1++;
            }else{
                p2--;
            }
        }
        return false;
    }
}