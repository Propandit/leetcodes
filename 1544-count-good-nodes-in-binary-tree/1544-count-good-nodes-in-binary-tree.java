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
     public int c=0;
    public void count(TreeNode root,int max){
        if(root==null){
            return;
        }
        if(root.val>=max){
            c++;
            max=root.val;
        }
        count(root.left,max);
        count(root.right,max);
    
    }
    public int goodNodes(TreeNode root) {
        count(root,root.val);
        return c;
    }
    }