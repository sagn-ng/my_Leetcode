#include <iostream>
#include <vector>
#include "TreeNode.h"
using namespace std;

class Solution {
private:
    void dfs(vector<vector<int>>& result, vector<int>& path, int curSum,
             TreeNode* root, int targetSum) {
        if (root == NULL)
            return;

        path.push_back(root->val);
        curSum += root->val;

        if (root->left == NULL && root->right == NULL && curSum == targetSum) {
            result.push_back(path);
        }

        dfs(result, path, curSum, root->left, targetSum);
        dfs(result, path, curSum, root->right, targetSum);

        path.pop_back();
    }

public:
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> result;
        vector<int> path;

        int curSum = 0;
        dfs(result, path, curSum, root, targetSum);

        return result;
    }
};

int main(){
    TreeNode *left=new TreeNode(5);
    TreeNode *right=new TreeNode(6);
    TreeNode *root=new TreeNode(2, left, right);

    Solution obj;
    vector<vector<int>> result=obj.pathSum(root, 7);
    for (vector<int> A: result){
        for (int u: A) cout<<u<<" ";
        cout<<'\n';
    }
    return 0;
}