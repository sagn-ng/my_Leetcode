import java.util.Arrays;
import java.util.Scanner;
public class UniqueBST {
    private static int helper(int i, int[] dp){
        if (i==0 || i==1) return 1;
        if (dp[i]!=-1) return dp[i];

        dp[i]=0;
        for (int j=1; j<=i; j++){
            dp[i]+=helper(j-1, dp)*helper(i-j, dp);
        }
        return dp[i];
    }
    public static int numTrees(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        if (n>19){
            throw new ArithmeticException("Integer overflow!\n");
        }

        else System.err.print(numTrees(n));
    }
}