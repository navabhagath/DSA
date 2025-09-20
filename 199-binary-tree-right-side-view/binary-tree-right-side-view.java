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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>>l = level(root);
        List<Integer>ans = new ArrayList<>();
        for(List<Integer>x : l){
            ans.add(x.get(x.size()-1));
        }
        return ans;
    }
    public List<List<Integer>> level(TreeNode root){
        List<List<Integer>>ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode>q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int len = q.size();
            List<Integer>ds = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                ds.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            ans.add(ds);
        }
        return ans;
    }
}