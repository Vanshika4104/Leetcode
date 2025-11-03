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
    public boolean isIdentical( TreeNode root, TreeNode subroot){
        if(root==null && subroot==null){
            return true;
        }else if(root == null || subroot == null || root.val != subroot.val){
            return false;
        }
        return isIdentical(root.left,subroot.left) && isIdentical(root.right, subroot.right);
    }
    public boolean subTree(TreeNode root, TreeNode subroot){
        if(root==null){
            return false;
        }
        if(subroot == null){
            return true;
        }
        if(root.val == subroot.val){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return subTree(root.left, subroot ) || subTree(root.right, subroot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return subTree(root, subRoot);
    }
}