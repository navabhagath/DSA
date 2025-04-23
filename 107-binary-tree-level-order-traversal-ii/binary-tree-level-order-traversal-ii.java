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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode>q=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<len;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                ds.add(q.poll().val);
            }
            ans.add(ds);
        }
        Collections.reverse(ans);
        return ans;
    }
}