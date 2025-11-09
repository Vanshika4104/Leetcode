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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0; i< inorder.length; i++){
            map.put(inorder[i] , i);

        }

        return binaryTree(inorder, 0, inorder.length-1, postorder, 0 , postorder.length-1, map);
    }

    public TreeNode binaryTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> map){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }

        TreeNode root= new TreeNode(postorder[postEnd]);

        int inRoot= map.get(root.val);
        int numsleft= inRoot - inStart;

        root.left= binaryTree(inorder, inStart, inRoot-1, postorder, postStart, postStart+numsleft-1, map );

        root.right= binaryTree(inorder, inRoot+1 , inEnd, postorder, postStart+numsleft, postEnd-1, map );

        return root;
    }
}