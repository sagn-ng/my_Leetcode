public class ValidSudoku {
    private boolean ValidRow(char[][] board, int row){
        int[] freq=new int[9];
        for (int i=0; i<9; i++){
            if (board[row][i]!='.'){
                freq[board[row][i]-'1']++;
            }
        }
        for (int i=0; i<9; i++){
            if (freq[i]>1) return false;
        }
        return true;
    }

    private boolean ValidCol(char[][] board, int col){
        int[] freq=new int[9];
        for (int i=0; i<9; i++){
            if (board[i][col]!='.'){
                freq[board[i][col]-'1']++;
            }
        }
        for (int i=0; i<9; i++){
            if (freq[i]>1) return false;
        }
        return true;
    }

    private boolean ValidSubgrid(char[][] board, int row, int col){
        int[] freq=new int[9];
        int startRow=row-row%3, startCol=col-col%3;
        for (int i=startRow; i<startRow+3; i++){
            for (int j=startCol; j<startCol+3; j++){
                if (board[i][j]!='.'){
                    freq[board[i][j]-'1']++;
                }
            }
        }

        for (int u=0; u<9; u++){
            if (freq[u]>1) return false;
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        for (int row=0; row<9; row++){
            if (!ValidRow(board, row)) return false;
        }

        for (int col=0; col<9; col++){
            if (!ValidCol(board, col)) return false;
        }

        for (int row=0; row<9; row+=3){
            for (int col=0; col<9; col+=3){
                if (!ValidSubgrid(board, row, col)) return false;
            }
        }
        
        return true;
    }
}
