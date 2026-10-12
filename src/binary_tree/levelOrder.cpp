#include <iostream>
#include <vector>
#include <queue>
#include "TreeNode.hpp"
using namespace std;

vector<vector<int>> levelOrder(TreeNode* root) {
    if (root==NULL) return vector<vector<int>>(0);

    vector<vector<int>> res;

    queue<TreeNode*> store;
    store.push(root);

    while (!store.empty()){
        //the store in each turn will consist of elements having the same level
        int count=store.size();
        vector<int> curLevel;

        while (count>0){
            TreeNode* temp=store.front();
            store.pop();

            curLevel.push_back(temp->val);
            count--;
            if (temp->left!=NULL) store.push(temp->left);
            if (temp->right!=NULL) store.push(temp->right);
        }

        res.push_back(curLevel);
    } //normal level ordertraversal (BFS)

    return res;
}