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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return areSymmetric(root.left, root.right);
    }

    public boolean areSymmetric(TreeNode treeLeft, TreeNode treeRight) {
        // if they are both empty then they must be symmetric
        if (treeLeft == null && treeRight == null) {
            return true;
        } else if ((treeLeft == null) != (treeRight == null) || treeLeft.val != treeRight.val) {
            return false;
        } else {
            return areSymmetric(treeLeft.left, treeRight.right) && areSymmetric(treeRight.left, treeLeft.right);
        }
    }
}
