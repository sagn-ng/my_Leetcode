#include <iostream>
#include <vector>
#include <stack>
#include <string>
using namespace std;

void backtracking(int &n, vector<string> &result, string s, int openCount, int closeCount){
    if (openCount==n && closeCount==n) result.push_back(s);

    if (openCount<n) backtracking(n, result, s+"(", openCount+1, closeCount);
    if (closeCount<openCount) backtracking(n, result, s+")", openCount, closeCount+1);

    return;
}

vector<string> generateParenthesis(int n) {
    vector<string> result;
    string s="";
    backtracking(n, result, s, 0, 0);

    return result;
}