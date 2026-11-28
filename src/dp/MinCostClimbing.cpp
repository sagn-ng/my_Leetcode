#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
int minCostClimbingStairs(vector<int> &cost){
    int n=cost.size();
    vector<int> dp(n+1);
    for (int i=2; i<=n; i++) dp[i]=min(dp[i-2]+cost[i-2], dp[i-1]+cost[i-1]);
    return dp[n];
} //tabulation

int main(){
    vector<int> cost={1,100,1,1,1,100,1,1,100,1};
    cout<<minCostClimbingStairs(cost);
    return 0;
}