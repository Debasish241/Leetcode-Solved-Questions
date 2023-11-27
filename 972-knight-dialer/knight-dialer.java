class Solution {
    public int knightDialer(int n) {
        int [][] matrix = new int [4][3];
        int temp = 1;
        int [][][] dp = new int [4][3][n];
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                for (int k=0;k<n;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(i==3 && j==0){
                    matrix[i][j] = -1;
                }
                else if(i==3 && j==2)matrix[i][j]=-1;
                else if(i==3 &&j==1)matrix[i][j] = 0;
                else{
                    matrix[i][j] = temp;
                    temp++;
                }
            }
        }
        class Dfs{
            public int dfs(int i, int j, int jump){
                if(jump==0){
                    return 1;
                }
                if(dp[i][j][jump]!=-1){
                    return dp[i][j][jump];
                }
                int ans = 0;
                if(i+2<4 && j+1<3 && matrix[i+2][j+1]!=-1){
                    ans = (ans + dfs(i+2, j+1, jump-1))%1000000007;
                }
                if(i+2<4 && j-1>=0 && matrix[i+2][j-1]!=-1){
                    ans = (ans + dfs(i+2, j-1, jump-1))%1000000007;
                }
                if(i-2>=0 && j+1<3 && matrix[i-2][j+1]!=-1){
                    ans = (ans + dfs(i-2, j+1, jump-1))%1000000007;
                }
                if(i-2>=0 && j-1>=0 && matrix[i-2][j-1]!=-1){
                    ans = (ans + dfs(i-2, j-1, jump-1))%1000000007;
                }
                if(j+2<3 && i+1<4 && matrix[i+1][j+2]!=-1){
                     ans = (ans + dfs(i+1, j+2, jump-1))%1000000007;
                }
                if(j+2<3 && i-1>=0 && matrix[i-1][j+2]!=-1){
                     ans = (ans + dfs(i-1, j+2, jump-1))%1000000007;
                }
                if(j-2>=0 && i+1<4 && matrix[i+1][j-2]!=-1){
                     ans = (ans + dfs(i+1, j-2, jump-1))%1000000007;
                }
                if(j-2>=0 && i-1>=0 && matrix[i-1][j-2]!=-1){
                     ans = (ans + dfs(i-1, j-2, jump-1))%1000000007;
                }
                return dp[i][j][jump] = ans;
            }
        }
        int res = 0;
        Dfs obj = new Dfs();
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]!=-1){
                res = (res + obj.dfs(i, j, n-1))%1000000007;
                }
            }}
        return res;
    }
}