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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     List<List<Integer>> li=new ArrayList<>();
     ArrayList<Integer> list= new ArrayList<>();

path(root,targetSum,li,list);
return li;
    }
    public void path(TreeNode root,int targetSum,List<List<Integer>> li,ArrayList<Integer> list){
          if(root == null) return ;
         list.add(root.val);
    
        if(root.left == null &&  root.right== null){
            if (targetSum == root.val){
            li.add(new ArrayList<>(list));

        }
        }
        else{
      path(root.left,targetSum- root.val,li,list);
      path(root.right,targetSum - root.val,li,list);
        }
        list.remove(list.size()-1);
    }
}