#include <stdio.h>
#include <stdlib.h>
int helper(int* cost, int i, int* dp){
    if (i==0 || i==1) return 0;
    if (dp[i]!=-1) return dp[i];

    int prev_1=helper(cost, i-1, dp);
    int prev_2=helper(cost, i-2, dp);
    dp[i] = (prev_1+cost[i-1] > prev_2+cost[i-2]) ? prev_2+cost[i-2] : prev_1+cost[i-1];
    return dp[i];
}

int minCostClimbingStairs(int* cost, int costSize) {
    int* dp=(int*)malloc(sizeof(int)*(costSize+1));
    int j;
    for (j=0; j<=costSize; j++) dp[j]=-1;
    return helper(cost, costSize, dp);
}

int main(){
    int cost[]={1,100,1,1,1,100,1,1,100,1};
    printf("%d", minCostClimbingStairs(cost, sizeof(cost)/sizeof(int)));
    return 0;
}