class Solution {
    static void reverse(int row,int j,int[][]mat){
        int i=0;
        while(i<j){
            int temp=mat[row][i];
            mat[row][i]=mat[row][j];
            mat[row][j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int res[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[j][i]=res[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(i,matrix[0].length-1,matrix);
        }
    }
}