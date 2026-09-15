class SudokuSolver {

    private boolean isNumberInRow(char[][] board, char num, int row){
        for (int i=0; i<9; i++){
            if (board[row][i]==num) return true;
        }
        return false;
    }

    private boolean isNumberInColumn(char[][] board, char num, int col){
        for (int i=0; i<9; i++){
            if (board[i][col]==num) return true;
        }
        return false;
    }

    private boolean isNumberInBox(char[][] board, char num, int row, int col){
        int localBoxRow = row-(row%3);
        int localBoxCol=col-(col%3);

        for (int i=localBoxRow; i<localBoxRow+3; i++){
            for (int j=localBoxCol; j<localBoxCol+3; j++){
                if (board[i][j]==num) return true;
            }
        }
        return false;
    }

    private boolean isValidPlacement(char[][] board, char num, int row, int col){
        return (!isNumberInRow(board, num, row) &&
        !isNumberInColumn(board, num, col) && 
        !isNumberInBox(board, num, row, col));
    }

    private boolean solveBoard(char[][] board){
        for (int row=0; row<9; row++){
            for (int col=0; col<9; col++){

                if (board[row][col]=='.'){
                    for (char c='1'; c<='9'; c++){
                        if (isValidPlacement(board, c, row, col)){
                            board[row][col]=c;
                            if (solveBoard(board)) return true;
                            else board[row][col]='.';
                        }
                    } //try all cases
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solveBoard(board);
    }
}