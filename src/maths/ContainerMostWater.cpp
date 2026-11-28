#include <iostream>
#include <vector>
using namespace std;

int maxArea(vector<int>& heights){
    int i=0, j=heights.size()-1;
    int ans=0;

    while (i<=j){
        int curS=(j-i)*min(heights[i], heights[j]); //evaluate the current area created by i and j
        if (curS>ans) ans=curS; //update the answer if possible

        //move one of the two pointers to look for changes in min(heights[i], heights[j])
        if (heights[i]<heights[j]) i++;

        else j--;
    }

    return ans;
}

/*the formula in (*) means modifying the bigger value between heights[i]
and heights[j] cannot result in a bigger answer since (j-i) is also decreasing.
Thus, we move the pointer that contains the smaller value to look for a bigger
one, hence updating the answer if possible*/

int main(){
    vector<int> heights={1,8,6,2,5,4,8,3,7};
    cout<<maxArea(heights);

    return 0;
}