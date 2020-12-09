/*
Problem name: 965. Univalued Binary Tree
Problem link: https://leetcode.com/problems/univalued-binary-tree/
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
    bool isUnivalTree(TreeNode* root) {
        return check(root, root->val);
    }
    bool check(TreeNode* root, int val){
        if(!root)   return true;
        return (root->val != val)? false : (check(root->left, val) and check(root->right, val));
    }
};
