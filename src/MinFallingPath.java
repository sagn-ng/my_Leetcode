
public class MinFallingPath {
    private int min3(int a, int b, int c){
        if (a>b) a=b;
        if (a>c) a=c;
        return a;
    }

    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        if (n==1) return matrix[0][0];

        int[] cur=matrix[0];

        for (int i=1; i<n; i++){
            int[] next=new int[n];
            for (int j=0; j<n; j++){
                if (j==0){
                    next[j]=Math.min(cur[0], cur[1])+matrix[i][j];
                }

                else if (j==n-1){
                    next[j]=Math.min(cur[n-1], cur[n-2])+matrix[i][j];
                }

                else{
                    next[j]=min3(cur[j-1], cur[j], cur[j+1])+matrix[i][j];
                }
            }

            cur=next;
        }

        int res=10000;
        for (int u: cur) res=Math.min(res, u);
        return res;
    }
}