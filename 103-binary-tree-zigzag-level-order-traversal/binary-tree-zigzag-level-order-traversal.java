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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        int level=0;
         boolean flag=true;
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode n=q.poll();
                if(flag) ds.add(n.val);
                else ds.add(0,n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);   
            }
            flag=!flag;
            ans.add(ds);
        }
        return ans;
    }
}