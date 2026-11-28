#include <iostream>
#include <string>
#include <vector>
#include <stack>
using namespace std;
int evalRPN(vector<string>& tokens) {
    stack<int> op;
    for (string s: tokens){
        if (s!="+" && s!="-" && s!="*" && s!="/"){
            op.push(stoi(s));
        }
        else{
            int x2=op.top();
            op.pop();
            int x1=op.top();
            op.pop();
        
            if (s=="+") op.push(x1+x2);
            else if (s=="-") op.push(x1-x2);
            else if (s=="*") op.push(x1*x2);
            else op.push(x1/x2);
        }
    }
    return op.top();
}