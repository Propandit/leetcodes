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
    int count=0;
    public int goodNodes(TreeNode root) {
        print(root,Integer.MIN_VALUE);
        return count;
    }
    public void print(TreeNode root,int maxval){
        if(root==null) return;
        if(root.val>=maxval){
            count++;
            maxval=root.val;

        }
        print(root.left,maxval);
        print(root.right,maxval);
    }
}