/*
Problem name: Validate Binary Search Tree
Problem link: https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/625
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
    bool isValidBST(TreeNode* root) {
        return helper(root, (long long)INT_MAX+1, (long long)INT_MIN-1);
    }
    
    bool helper(TreeNode* root, long long minVal, long long maxVal){
        if(!root)   return true;
        if(root->val >= minVal || root->val <= maxVal)   return false;
        
        return helper(root->left, (long long)root->val, maxVal) && helper(root->right, minVal , (long long)root->val);        
    }
};
