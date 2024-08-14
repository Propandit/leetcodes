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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return flag;
        }
    height(root);
        return flag;
    }
        public int height(TreeNode root){
            if(root ==null) return 0;
            int left=height(root.left);
            int right=height(root.right);
            int diff=Math.abs(left-right);
            if(diff>1){
                flag=false;
             System.out.println(diff);}
            return Math.max(left,right)+1;
        }

    }
