class Solution {
  public int uniquePaths(int m, int n) {
    // int[] dp = new int[n];
    // Arrays.fill(dp, 1);

    // for (int i = 1; i < m; ++i)
    //   for (int j = 1; j < n; ++j)
    //     dp[j] += dp[j - 1];

    // return dp[n - 1];
    int[][] ar =new int[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0){
                ar[i][j]=1;
            }
            else{
                ar[i][j]=ar[i-1][j]+ar[i][j-1];

            }
        }
    }
    return ar[m-1][n-1];
  }
}