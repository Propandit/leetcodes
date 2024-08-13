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
    // public int diameterOfBinaryTree(TreeNode root) {
    //     if(root==null){
    //         return 0;
    //     }
    //     int left=diameterOfBinaryTree(root.left)+1;
    //     int right=diameterOfBinaryTree(root.right)+1;
        

    //     int leftsub=height(root.left);
    //     int rightsub=height(root.right);
    //     int cur=(leftsub+rightsub);
    //     return Math.max(cur,Math.max(leftsub,rightsub));
    // }
    //  public static int height(TreeNode root) {
    //      if(root == null) return 0;
    //     int l = height(root.left) + 1;
    //     int r = height(root.right) + 1;
    //     return Math.max(l,r);
    //     }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        height(root);
        return diameter;
        
    }
    public int height(TreeNode node)
    {
        if(node == null)
        return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = leftHeight + rightHeight ;
        diameter = Math.max(dia,diameter);
        return Math.max(leftHeight,rightHeight)+1;
    }
    }
