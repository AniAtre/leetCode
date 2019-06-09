package tree;
/**
* Problem Statement:
* Given a binary tree, determine if it is a valid binary search tree (BST).
*
* Assume a BST is defined as follows:
*
* The left subtree of a node contains only nodes with keys less than the node's key.
* The right subtree of a node contains only nodes with keys greater than the node's key.
* Both the left and right subtrees must also be binary search trees.
*
* Example 1:
*     2
*    / \
*   1   3
*
* Input: [2,1,3]
* Output: true
*
* Example 2:
*     5
*    / \
*   1   4
*      / \
*     3   6
*
* Input: [5,1,4,null,null,3,6]
* Output: false
* Explanation: The root node's value is 5 but its right child's value is 4.
*
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/

import shared.TreeNode;

public class ValidBST{
    public boolean isValidBST(TreeNode root){
        return isValidBSTHelper(root, null, null);
    }

    public boolean isValidBSTHelper(TreeNode node, Integer min, Integer max){
        if(node == null){
            return true;
        }
        if(min != null && node.val >= min){
            return false;
        }
        if(max != null && node.val <= max){
            return false;
        }
        return isValidBSTHelper(node, min, node.val) && isValidBSTHelper(node, node.val, max);
    }
}