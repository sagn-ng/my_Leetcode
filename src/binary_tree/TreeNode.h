#ifndef TREENODE_H
#define TREENODE_H

struct TreeNode
{
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode() : val(0), right(nullptr), left(nullptr) {}
    TreeNode(int val) : val(val), right(nullptr), left(nullptr) {}
    TreeNode(int val, TreeNode* left, TreeNode* right) : val(val), right(right), left(left) {}
};

#endif