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
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        boolean flag=false;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>ls=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                if(cur.left!=null){q.add(cur.left);}
                if(cur.right!=null){ q.add(cur.right);}
                ls.add(cur.val);
            }
            if(flag){
                Collections.reverse(ls);
            }
            result.add(ls);
            flag=!flag;
        }
        return result;
    }  
}