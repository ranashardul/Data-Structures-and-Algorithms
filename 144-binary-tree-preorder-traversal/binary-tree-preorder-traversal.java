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

        // APPROACH 1 - USING RECURSION

    //     List<Integer> arr = new ArrayList<>();
    //     preorder(root, arr);
    //     return arr;
    // }

    // public void preorder(TreeNode root, List<Integer> arr){
    //     if(root == null) return;

    //     arr.add(root.val);
    //     preorder(root.left, arr);
    //     preorder(root.right, arr);
    // }

    // APPROACH 2 - USING ITERATION

    List<Integer> arr = new ArrayList<>();
    if(root == null) return arr;

    Stack<TreeNode> st = new Stack<>();
    st.push(root);

    while(!st.empty()){
        root = st.pop();
        arr.add(root.val);

        if(root.right!=null) st.push(root.right);
        if(root.left!=null) st.push(root.left);
    }

    return arr;
    }
}