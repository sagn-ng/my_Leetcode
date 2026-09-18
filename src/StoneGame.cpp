#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool stoneGame(vector<int>& piles) {
        return true;
    }
};
/*
explanation:
- suppose we color piles[i] with even i's black and color the rest with white.
the sum of stones across all the piles is odd, and, let sumBlack be the
total number of stones in black piles and sumWhite be the total number of stones
left, then:
- We have 2 cases:
+ if sumBlack > sumEven, Alice will take all the black piles, she will win.
+ otherwise, Alice will take all the white piles, she must win too.
Thus, Alice will definitely win, we simply return true
*/