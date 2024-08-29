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
    public int sumRootToLeaf(TreeNode root) {
         return print(root,0);
    }
    private int print(TreeNode root,int sum){
        if(root==null) return 0;
if(root.left==null && root.right==null){
    return sum*2+root.val;
}
return print(root.left,sum*2 + root.val) + print(root.right,sum*2 + root.val);
    }
}