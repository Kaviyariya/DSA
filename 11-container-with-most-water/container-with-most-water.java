class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1,max=0;
        while(l<r){
             int w=r-l;
            if(h[l]<h[r]){
                max=Math.max(max,h[l]*w);
                l++;
            }else{
                max=Math.max(max,h[r]*w);
                r--;
            }
        }
        return max;
    }
}