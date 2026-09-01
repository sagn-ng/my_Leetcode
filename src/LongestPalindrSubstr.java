public class LongestPalindrSubstr {
    private void fillTable(boolean[][] dp, String s){
        int n=s.length();

        for (int diff=0; diff<n; diff++){
            for (int i=0; i+diff<n; i++){
                int j=i+diff;
                if (diff==0) dp[i][j]=true;

                else if (diff==1){
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                }
                
                else{
                    if (dp[i+1][j-1]) dp[i][j] = (s.charAt(i)==s.charAt(j));
                    else dp[i][j]=false;
                }
            }
        }
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];

        fillTable(dp, s);

        int max_len=0;
        String res="";
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (dp[i][j]==true && j-i+1>max_len){
                    max_len=j-i+1;
                    res=s.substring(i, j+1);
                }
            }
        }

        return res;
    }
}