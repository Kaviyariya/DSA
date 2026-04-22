class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length,m=grid[0].length,r=n-1,c=0,count=0;
        while(r>=0&&c<m){
            if(grid[r][c]<0){
                count+=m-c;
                r--;
            }else{
                c++;
            }
        }
        return count;
    }
}