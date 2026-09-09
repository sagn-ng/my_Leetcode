#include <iostream>
#include "ListNode.hpp"
using namespace std;

ListNode* removeNthFromEnd(ListNode* head, int n) {
    ListNode* cur=head;
    ListNode* temp=head;
    for (int i=0; i<n; i++) cur=cur->next;

    if (cur==NULL) return head->next; //n==sz

    while (cur->next!=NULL){
        cur=cur->next;
        temp=temp->next;
    } //temp will be right before the aiming node
        
    temp->next=temp->next->next; //skip the aiming node

    return head;
}

void printList(ListNode* head){
    while (head!=NULL){
        cout<<head->val<<" ";
        head=head->next;
    }
}

int main(){
    ListNode* node4=new ListNode(4, NULL);
    ListNode* node3=new ListNode(3, node4);
    ListNode* node2=new ListNode(2, node3);
    ListNode* node1=new ListNode(1, node2);
    // 1 -> 2 -> 3 -> 4
    node1=removeNthFromEnd(node1, 3);
    printList(node1); //output: 1 3 4

    return 0;
}