#include <iostream>
#include <vector>
#include <exception>
using namespace std;

int helper(vector<vector<int>> &dp, int i, int j){
    if (i==0 || j==0) return 1;
    if (dp[i][j]!=-1) return dp[i][j];

    dp[i][j]=helper(dp, i, j-1)+helper(dp, i-1, j);
    return dp[i][j];
}
int uniquePaths(int m, int n) {
    vector<vector<int>> dp(m, vector<int>(n, -1));
    return helper(dp, m-1, n-1);
}

int main(){
    int m, n;
    cin>>m>>n;
    if (m<=0 || m<=0){
        cout<<"m and n must be greater than 0!";
    }
    else cout<<uniquePaths(m, n);
    return 0;
}