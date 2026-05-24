class Solution {
    public int mySqrt(int x) {
        long si=1,li=x;
        while(si<=li){
            long mid=(si+li)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid<x){ 
                si=mid+1;
            }
            else li=mid-1;
        }
        return (int)li;
        
    }
}