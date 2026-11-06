#include <iostream>
#include "ListNode.hpp"

using namespace std;

void reorderList(ListNode* head){
    //find the 'middle' node to split the list into 2
    ListNode* slow=head;
    ListNode* fast=head->next;

    while (fast!=NULL && fast->next!=NULL){
        fast=fast->next->next;
        slow=slow->next;
    }

    ListNode* second=slow->next;
    slow->next=NULL; //spliting the list into 2

    //reversing the second half
    ListNode* prev=NULL;
    while (second!=NULL){
        ListNode* temp=second->next;
        second->next=prev;
        prev=second;
        second=temp;
    }

    second=prev; //mark the final element of the reversed half

    //merging:
    ListNode* first=head;

    while (second!=NULL){ //since the second half might be shorter
        ListNode *temp1=first->next, *temp2=second->next;

        first->next=second;
        second->next=temp1;

        first=temp1;
        second=temp2;
    }

    return;    
}