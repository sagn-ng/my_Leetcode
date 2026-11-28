#include <iostream>
#include <vector>
using namespace std;

int minEatingSpeed(vector<int>& piles, int h) {
    int max=1;
    for (int u: piles){
        if (u>max) max=u;
    }

    int left=1, right=max, ans=0;
    while (left<=right){
        int mid=left+(right-left)/2;

        long long hCount=0;
        for (int u: piles){
            hCount+=(1LL*u+mid-1)/mid;
        }

        if (hCount>h) left=mid+1;
        else{
            ans=mid;
            right=mid-1;
        }
    }

    return ans;
}

int main(){
    vector<int> piles={30,11,23,4,20};
    int h=6;
    cout<<minEatingSpeed(piles, h); //output: 23
    return 0;
}