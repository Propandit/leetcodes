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
    ArrayList<Integer> res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        print(root);
        return res;
    }
    public void print(TreeNode root){
        if(root==null){
            return ;
        }
        print(root.left);
        print(root.right);
        res.add(root.val);
        return ;
    }
}