#include <iostream>
#include <vector>
using namespace std;

bool isRectangleOverlap(vector<int>& rec1, vector<int>& rec2) {
    bool vertOverlap = rec1[1]<rec2[3] && rec1[3]>rec2[1];
    bool horiOverlap = rec1[0]<rec2[2] && rec1[2]>rec2[0];
    return vertOverlap && horiOverlap;
}

int main(){
    vector<int> rec1={0,0,2,2};
    vector<int> rec2={1,1,3,3};
    cout<<isRectangleOverlap(rec1, rec2)<<endl; //output: 1

    rec1={0,0,1,1};
    rec2={1,0,2,1};
    cout<<isRectangleOverlap(rec1, rec2); //output: 0
    return 0;
}