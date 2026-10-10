#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

long long minSumSquareDiff(vector<int>& nums1, vector<int>& nums2, int k1, int k2) {
    int maxDiff=0, n=nums1.size();

    for (int i=0; i<n; i++){
        int temp=abs(nums1[i]-nums2[i]);
        maxDiff=max(maxDiff, temp);
    }

    vector<int> bucket(maxDiff+1);
    for (int i=0; i<n; i++){
        int temp=abs(nums1[i]-nums2[i]);
        bucket[temp]++;
    }

    int K=k1+k2;
    for (int u=maxDiff; u>=1 && K>0; u--){
        int maxTake=min(bucket[u], K);
        bucket[u]-=maxTake;
        bucket[u-1]+=maxTake;
        K-=maxTake;
    }

    long long ans=0;
    for (int i=0; i<=maxDiff; i++){
        if (bucket[i]!=0) ans+=1ll*i*i*bucket[i];
    }

    return ans;
}

int main(){
    vector<int> nums1={1,2,3,4};
    vector<int> nums2={2,10,20,19};
    int k1=2, k2=1;
    cout<<minSumSquareDiff(nums1, nums2, k1, k2); //output:486

    return 0;
}