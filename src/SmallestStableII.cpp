#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int firstStableIndex(vector<int>& nums, int k) {
    int n = nums.size();

    int ansIdx = 0;
    int globalMax = 0;
    int ansMax = 0; 

    for(int i = 0; i < n; i++){
        globalMax = max(globalMax, nums[i]);

        if(i == ansIdx)
            ansMax = max(ansMax, nums[i]);

        if(nums[i] < ansMax - k){
            ansIdx = i + 1;
            ansMax = globalMax;
        }
    }

    return ansIdx < n ? ansIdx : -1;
}