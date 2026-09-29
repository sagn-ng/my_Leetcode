#include <iostream>
#include <vector>
using namespace std;

class NQueens {
private:
    bool safeSquare(vector<vector<int>>& board, int row, int col, int& n){
        int i, j, k;

        for (i=0; i<row; i++){
            if (board[i][col]==1) return false;
        }

        for (i=row-1, j=col-1, k=col+1; i>=0; i--){
            if (j>=0){
                if (board[i][j]==1) return false;
                j--;
            }
            
            if (k<n){
                if (board[i][k]==1) return false;
                k++;
            }
        }

        return true;
    }

    void placeQueens(vector<vector<int>>& board, int &count, int row, int& n){
        if (row==n){
            count++;
            return;
        }

        for (int i=0; i<n; i++){
            if (safeSquare(board, row, i, n)){
                board[row][i]=1;
                placeQueens(board, count, row+1, n);
            }

            board[row][i]=0;
        }
    }

public:
    int totalNQueens(int n){
        vector<vector<int>> board(n, vector<int>(n));
        int count=0;

        placeQueens(board, count, 0, n);

        return count;
    }
};

int main(){
    int n=4;
    NQueens obj;
    cout<<obj.totalNQueens(n);
    return 0;
}