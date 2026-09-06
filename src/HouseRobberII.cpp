#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
/*
If the first house is robbed, the last house can't be robbed;
and if the last house is robbed then the first one can't be.
However, if there is only one house, simply return that house's money
*/

int helper(vector<int> &nums, int start, int end){
    int prev1=0, prev2=0;
    for (int i=start; i<=end; i++){
        int temp=max(prev2+nums[i], prev1);
        prev2=prev1;
        prev1=temp;
    }

    return prev1;
}

int rob(vector<int>& nums) {
    int n=nums.size();
    if (n==1) return nums[0];
    int notRobFirst=helper(nums, 1, n-1);
    int notRobLast=helper(nums, 0, n-2);
    return max(notRobFirst, notRobLast);
}

int main(){
    vector<int> nums={2,3,2,5,7,9,10};
    cout<<rob(nums); //ouput: 20 (3 -> 7 -> 10)
    return 0;
}