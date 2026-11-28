#include <iostream>
#include <vector>
using namespace std;

bool canJump(vector<int>& nums) {
    int n=nums.size();
    int goal=n-1;
    for (int i=n-2; i>=0; i--){
        if (i+nums[i]>=goal) goal=i;
    }

    return (goal==0);
}

int main(){
    vector<int> nums={2,3,1,1,4};
    cout<<(canJump(nums)  ? "true" : "false"); //output: true
    return 0;
}

/*
Note that: for j>i, if we can reach index j from
index i, i.e: i+nums[i]>=j, then we only need to
check if we can reach index i or not.
Thus, our "goal" variable is decreasing, if we're
able to reach the last index, "goal" must be 0 in
the end
*/