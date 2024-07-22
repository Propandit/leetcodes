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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        print(arr,0,root);
        Collections.reverse(arr);
        return arr;
    }
    public void print(List<List<Integer>> arr,int level,TreeNode root){
        if(root==null){
            return;
        }if(arr.size()<=level){
            arr.add(new ArrayList<>());
        }arr.get(level).add(root.val);
print(arr,level+1,root.left);
print(arr,level+1,root.right);
return;
}
}