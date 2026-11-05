#include <iostream>
#include "ListNode.hpp"
using namespace std;

ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    int temp=l1->val+l2->val;
    int memo=0;

    if (temp>=10){
        temp-=10; memo=1;
    }

    ListNode* tail=new ListNode(temp, NULL);
    ListNode* res=tail;

    l1=l1->next; l2=l2->next;

    while (l1!=NULL || l2!=NULL){
        temp=0;
        if (l1!=NULL) temp+=l1->val;
        if (l2!=NULL) temp+=l2->val;

        if (memo!=0){
            temp+=memo;memo=0;
        }

        if (temp>=10){
            temp-=10; memo=1;
        }

        tail->next=new ListNode(temp, NULL);
        tail=tail->next;

        if (l1!=NULL) l1=l1->next;
        if (l2!=NULL) l2=l2->next;
    }

    if (memo!=0){
        tail->next=new ListNode(1, NULL);
    }

    return res;
}