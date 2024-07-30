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
public class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        helper(root, low, high);
        return sum;
        
    }

    public void helper(TreeNode root, int low, int high){
        if(root!=null){
            if(low<=root.val && root.val<=high){
                sum+=root.val;
            }
            if(low<root.val){
                helper(root.left, low, high);
            }
            if(high>root.val){
                helper(root.right, low, high);
            }
        }
    }
}