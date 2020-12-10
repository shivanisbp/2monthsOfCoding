/*
Problem name: 257. Binary Tree Paths
Problem link: https://leetcode.com/problems/binary-tree-paths/
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
    vector<string> ans;
    vector<string> binaryTreePaths(TreeNode* root) {
        if(!root)
            return ans;
        
        dfs(root, "", ans);
        return ans;
    }
    void dfs(TreeNode* root, string val, vector<string> &ans){
        val+=to_string(root->val);
        if(root->left == NULL && root->right == NULL){
            ans.push_back(val);
            return;
        }
        
        if(root->left)
            dfs(root->left, val+"->", ans);
        
        if(root->right)
            dfs(root->right, val+"->", ans);
        return;
    }
};
