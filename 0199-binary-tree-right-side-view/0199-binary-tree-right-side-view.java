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
    ArrayList<Integer> arr= new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightView(root,arr,0);
        return arr;
    }
   public void rightView(TreeNode root, List<Integer> arr, int currDepth){
        if(root == null){
            return;
        }
        if(currDepth == arr.size()){
            arr.add(root.val);
        }
        
        rightView(root.right,arr, currDepth + 1);
        rightView(root.left ,arr, currDepth + 1);
    }
}