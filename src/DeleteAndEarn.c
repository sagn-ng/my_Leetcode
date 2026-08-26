#include <stdio.h>
#include <stdlib.h>
int min(int a, int b){
    return (a>b) ? b : a;
}
int numSquares(int n){
    int* dp=(int*)malloc(sizeof(int)*(n+1));
    dp[0]=0;
    for (int i=1; i<=n; i++){
        dp[i]=INT_MAX;
        for (int j=1; j*j<=i; j++) dp[i]=min(dp[i], dp[i-j*j]+1);
    }
    int res=dp[n];
    free(dp);
    return res;
}

int main(){
    printf("%d", numSquares(111));
    return 0;
}