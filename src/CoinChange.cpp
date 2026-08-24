#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
int coinChange(vector<int>& coins, int amount) {
    vector<int> dp(amount+1, 100001); //put a number that is large enough
    dp[0]=0;
    for (int i=1; i<=amount; i++){
        for (int c: coins){
            if (i>=c) dp[i]=min(dp[i], dp[i-c]+1);
        }
    }
    return (dp[amount]==100001) ? -1 : dp[amount];
} //tabulation

int main(){
    vector<int> coins={1,2,5,3};
    int amount=25;
    cout<<coinChange(coins, amount);
    return 0;
}