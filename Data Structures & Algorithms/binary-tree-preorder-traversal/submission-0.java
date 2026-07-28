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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preTraversal(root,list);
        return list;
    }
    public void preTraversal(TreeNode node,List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preTraversal(node.left ,list);
        preTraversal(node.right,list);
    }
}