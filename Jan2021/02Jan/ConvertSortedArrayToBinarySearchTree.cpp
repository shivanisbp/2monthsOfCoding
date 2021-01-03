/*
Problem name: Convert Sorted Array to Binary Search Tree
Problem link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
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
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return helper(nums, 0, nums.size());
    }
    TreeNode* helper(vector<int>& nums, int min, int max){
        if(min >= max)
            return NULL;
        int mid = (min+max)/2;
        TreeNode* node = new TreeNode(nums[mid]);
        node->left = helper(nums, min, mid);
        node->right = helper(nums, mid+1, max);
        return node;
    }
};
