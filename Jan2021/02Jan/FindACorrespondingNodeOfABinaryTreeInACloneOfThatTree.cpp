/*
Problem name: 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
Problem link: https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target){
        if(original == NULL)    return NULL;
        if(original == target)  return cloned;
        TreeNode* left = getTargetCopy(original->left, cloned->left, target);
        if(left != NULL)
            return left;
        TreeNode* right = getTargetCopy(original->right, cloned->right, target);
        return right;
    }
};
