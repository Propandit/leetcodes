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
    int cameraCount = 0;

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == -1) {
            cameraCount++;
        }
        return cameraCount;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 1;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (left == -1 || right == -1) {
            cameraCount++;
            return 0;
        }

        if (left == 0 || right == 0) {
            return 1;
        }

        return -1;
    }
}
