/*
Problem name: 226. Invert Binary Tree
Problem link: https://leetcode.com/problems/invert-binary-tree/
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if(!root)
            return root;
        
        TreeNode* temp1;
        TreeNode* temp2;
        
        temp1=invertTree(root->left);
        temp2=invertTree(root->right);
        
        root->right=temp1;
        root->left=temp2;
        
        return root;
    }
};
