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
    List<Integer> ls = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode node) {
        if (node == null) {
            return new ArrayList<>();
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        ls.add(node.val);
        return ls;
    }
}
