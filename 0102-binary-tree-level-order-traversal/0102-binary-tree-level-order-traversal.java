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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
if(root ==null){
    return li;
}       
 q.offer(root);
while(q.size()>0){
    int x=q.size();
    ArrayList<Integer> arr=new ArrayList<>();
    while(x!=0){
        TreeNode curr=q.remove();
        if(curr.left!=null) q.offer(curr.left);
        if(curr.right!=null) q.offer(curr.right);
        arr.add(curr.val);
        x--;
}
li.add(new ArrayList(arr));

    }return li;
}}