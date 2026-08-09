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
    public boolean isSymmetric(TreeNode root) {
       if(root==null) return true;
        else
        return isSymmetricHelp(root.left,root.right);
    }
     public boolean isSymmetricHelp(TreeNode p,TreeNode q){
        // if(p.val!=q.val) return false;
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        // if(p.left==null&&q.right==null){
        //     // if(p.val!=q.val) return false;
        //     return true;
        // }
        // if(p.left==null||q.right==null)
        // return false;
         if(p.val!=q.val) return false;
        return isSymmetricHelp(p.left,q.right)&&isSymmetricHelp(p.right,q.left);
     }
}