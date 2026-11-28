#include <iostream>
#include <string>
using namespace std;

string longestPalindrome(string s) {
    int n=s.size();
    int max_len=0; //mark the length of the longest substring found
    string res;
    for (int i=0; i<n; i++){
        int right=i;
        while (right<n && s[i]==s[right]) right++;

        int left=i-1;
        while (left>=0 && right<n && s[left]==s[right]){
            left--; right++;
        } //s[left+1, right-1] is now a palindrome substring

        if (right-left-1>max_len){
            max_len=right-left-1;
            res=s.substr(left+1, right-left-1);
        }
    }

    return res;
}

int main(){
    string s="babad";
    cout<<longestPalindrome(s); //output: "bab"
    return 0;
}