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
 class pair{

     int first;
     int sec;
     pair(int first, int sec){

         this.first=first;
         this.sec=sec;
     }
 }
class Solution {
 
  int size=0;
   ArrayList<Integer>[] adj=new ArrayList[100001];
  

      void convert(TreeNode root){
        if(root==null) return;
       Queue<TreeNode> q=new LinkedList<>();
       q.add(root);

       while(!q.isEmpty()){
          int size=q.size();
          TreeNode node = q.remove();
        
        if(node.left!=null){
           adj[node.val].add(node.left.val);
           adj[node.left.val].add(node.val);
           q.add(node.left);
        }

        if(node.right!=null){
            adj[node.val].add(node.right.val);
             adj[node.right.val].add(node.val);
            q.add(node.right);
        }
      
       }
      
      }

    public int amountOfTime(TreeNode root, int start) {
        
        if(root==null) return 0;
         for(int i=0;i<100001;i++){
       adj[i]=new ArrayList<>();
      }


    
        convert(root);
          for(int i=0;i<15;i++){
          
              System.out.println(i+"-->"+adj[i]);
          }
      
        Queue<pair> q=new LinkedList<>();
       q.add(new pair(start,0));
       int ans=0;
       int vis[]=new int[100001];
      

      vis[start]=1;
      int step=0;
       while(!q.isEmpty()){

           int node=q.peek().first;
          step = q.peek().sec;
           q.remove();
           ans+=step;

           for(int it : adj[node]){
             
               if(vis[it]==0)
                q.add(new pair(it,step+1));
                vis[it]=1;
           }
       }


       return step;



       

    }
}