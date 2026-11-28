#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
int deleteAndEarn(vector<int>& nums){
    int maxOfnums=0;
    for (int u: nums) maxOfnums=max(maxOfnums, u);

    vector<int> Count(maxOfnums+1);
    vector<int> dp(maxOfnums+1);

    /*when we choose an element with value x (more than once), since x-1
    and x+1 have all been removed, we don't need to remove anything more,
    while the point for x is still counted*/
    for (int u: nums) Count[u]+=u;

    /*with the vector (or array) Count, the problem is now
    just like the House Robber problem, with Count is 1-indexed
    instead of 0-indexed*/
    dp[1]=Count[1];
    for (int i=2; i<=maxOfnums; i++){
        dp[i]=max(dp[i-1], dp[i-2]+Count[i]);
    }
    return dp[maxOfnums];
}

int main(){
    vector<int> nums={3,4,1,1,4,5,5};
    cout<<deleteAndEarn(nums); //output: 15
    return 0;
}