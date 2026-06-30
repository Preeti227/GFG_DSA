

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]; //primary diagonal
            sum+=mat[i][n-i-1];//secondary diagonal
        }
        
        return sum;
    }
}