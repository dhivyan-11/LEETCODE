class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int dp[][]=new int[m][n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp [i][j]=-1;
            }

        }
        return minCost(grid ,0 , 0 , dp);
        
    }
    public int minCost(int grid[][]  , int i ,int j , int[][] dp){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right= minCost(grid , i ,j+1 , dp);
        int down =minCost(grid , i+1 , j , dp);

        return dp[i][j] = grid[i][j]+Math.min(right , down);
    }
}