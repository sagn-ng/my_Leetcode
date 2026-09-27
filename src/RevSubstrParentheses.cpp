#include <iostream>
#include <string>
#include <vector>
#include <stack>
using namespace std;

string reverseParentheses(string s) {
    int n=s.size(), size=0;

    char *letters=new char[2001]; //the 'string' constructor requires a char* type

    stack<int> brackets;
    vector<int> brIdx(n);
    //we need a 'map' to find the position of each bracket's matching bracket
    //we do this by using a stack and an array to store the mapping results
    for (int i=0; i<n; i++){
        if (s[i]=='(') brackets.push(i);
        else if (s[i]==')'){
            int j=brackets.top();
            brackets.pop();

            brIdx[i]=j; brIdx[j]=i;
        }
    }

    vector<bool> visited(n); //mark if a bracket is used (to avoid an endless loop)
    bool moveRight=true; //indicate the moving direction of 'i'
    int i=0;

    for (int count=0; count<n; count++){
        if (s[i]>='a' && s[i]<='z'){
            letters[size++]=s[i];
        } //if a letter if found, add it to the result

        else{
            if (visited[i]==false) visited[i]=true;

            i=brIdx[i]; //jump to the position of its matching bracket
            moveRight=!moveRight; //change the moving direction
        }

        (moveRight) ? (i++) : (i--);
    } //'i' can jummp back and forth but only n times

    letters[size]='\0'; //mark the end of the result string

    string ans(letters);
    delete[] letters;
    return ans;
}
//time complexity: O(n)
//auxiliary space: O(n)

int main(){
    string s="(u(love)i)";
    cout<<reverseParentheses(s); //output: iloveu
    return 0;
}