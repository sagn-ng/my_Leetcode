#include <iostream>
#include <vector>
#include "ListNode.hpp"
using namespace std;

vector<int> nodesBetweenCriticalPoints(ListNode* head) {
    ListNode* prev = head;
    ListNode* cur = head->next;
    ListNode* ahead = head->next->next;

    int prevPos = 0, pos = 2, count = 0;

    vector<int> result(2);
    result[0] = 1e5;
        
    while (ahead != nullptr) {
        if ((cur->val > prev->val && cur->val > ahead->val) ||
            (cur->val < prev->val && cur->val < ahead->val)) {
            if (prevPos == 0)
                result[1] = pos; //store the first critical point
            else {
                if (pos - prevPos < result[0])
                    result[0] = pos - prevPos;
            } //if at least one critical point has been found

            prevPos = pos; //store the current critical point
            count++;
        }

        pos++;
        prev = cur;
        cur = ahead;
        ahead = ahead->next;
    }

    if (count < 2) {
        result[0] = result[1] = -1;
        return result;
    }

    result[1] = prevPos - result[1];
    return result;
}