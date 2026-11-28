#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
int rob(vector<int>& nums) {
    int n=nums.size();
    vector<int> dp(n+1);
    dp[1]=nums[0];
    for (int i=2; i<=n; i++){
        dp[i]=max(dp[i-1], dp[i-2]+nums[i-1]);
    }
    return dp[n];
} //tabulation

int main(){
    vector<int> nums={2,7,9,3,1};
    cout<<rob(nums);
    return 0;
}