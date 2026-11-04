#include <iostream>
#include "ListNode.hpp"
using namespace std;

ListNode* getIntersectionNode(ListNode* headA, ListNode* headB){
    ListNode* copyA=headA;
    ListNode* copyB=headB;

    int lenA=0, lenB=0;
    while (copyA!=NULL){
        lenA++;
        copyA=copyA->next;
    }

    while (copyB!=NULL){
        lenB++;
        copyB=copyB->next;
    }

    int t=abs(lenA-lenB);
    if (lenA>lenB){
        while (t>0){
            headA=headA->next;
            t--;
        }
    }

    else{
        while (t>0){
            headB=headB->next;
            t--;
        }
    }

    while (headA!=NULL && headB!=NULL){
        if (headA==headB) return headA;

        headA=headA->next;
        headB=headB->next;
    }

    return NULL;
}