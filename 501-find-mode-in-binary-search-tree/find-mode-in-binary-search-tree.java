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
    public int[] findMode(TreeNode root) {
        List<Integer>al=new ArrayList<>();
        in(root,al);
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int num : al){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int maxfrq=Collections.max(mp.values());
        for(Map.Entry<Integer,Integer>en : mp.entrySet()){
            if(en.getValue() == maxfrq){
                ans.add(en.getKey());
            }
        }
        int len = ans.size();
        int []res=new int[len];
        for(int i=0;i<len;i++){
            res[i]=ans.get(i);
        }
        
        return res;
    }
    public void in(TreeNode root,List<Integer>al){
        if(root==null) return;
        in(root.left,al);
        al.add(root.val);
        in(root.right,al);
    }
}