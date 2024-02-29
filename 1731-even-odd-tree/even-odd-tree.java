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
    public boolean isEvenOddTree(TreeNode root) {
        int level=0;
        
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            if(level%2==0){
                int prev=-1;
                for(int i=0;i<size;i++){
                   TreeNode node=q.remove();
                   if(node.val%2!=1){
                       return false;
                   }
                   if(node.val<=prev) return false;
                   prev=node.val;
                   if(node.left!=null) q.offer(node.left);
                   if(node.right!=null) q.offer(node.right);
                }
            }
            else{
                int prev=Integer.MAX_VALUE;
                for(int i=0;i<size;i++){
                   TreeNode node=q.remove();
                   if(node.val%2!=0){
                       return false;
                   }
                   if(node.val>=prev) return false;
                   prev=node.val;
                   if(node.left!=null) q.offer(node.left);
                   if(node.right!=null) q.offer(node.right);
                }
                
            }
            level++;
        }
        return true;
    }
}