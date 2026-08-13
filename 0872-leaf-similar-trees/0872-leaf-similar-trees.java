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
    void Check(TreeNode t, StringBuilder s){
        if(t==null) return;
        if(t.left==null && t.right==null)
        {s.append(t.val).append("_");
         return;
        }
        Check(t.left,s);
        Check(t.right,s);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // if(root1.left==null&&root1.right==null&&root2.left==null&&root2.right==null) {
        //     if(root1.val==root2.val) return true;
        //     return false;}
     StringBuilder S1= new StringBuilder();  
     StringBuilder S2= new StringBuilder();  
     Check(root1,S1);
     Check(root2,S2);    
     return S1.toString().equals(S2.toString());   
    }
}