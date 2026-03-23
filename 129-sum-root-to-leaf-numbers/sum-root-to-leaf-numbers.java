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
    public int fun(int sum,TreeNode root){
          if(root==null) return 0;
          sum=sum*10+root.val;
          if(root.left==null && root.right==null){
            return sum;
          }
          return fun(sum,root.left) + fun(sum,root.right);
    }
    public int sumNumbers(TreeNode root) {
        int sum=0;
        sum=fun(sum,root);
        return sum;  
      
    }
}