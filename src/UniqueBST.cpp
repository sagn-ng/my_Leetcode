#include <iostream>
#include <vector>
using namespace std;
int numTrees(int n) {
    vector<int> C(n+1);
    C[0]=C[1]=1;
        
    for (int i=2; i<=n; i++){
        for (int j=1; j<=i; j++){
            C[i]+=C[j-1]*C[i-j];
        }
    }
    
    return C[n];
}

int main(){
    cout<<numTrees(5);
    return 0;
}