class Solution {
    public int trailingZeroes(int n) {
        int cnt=0,pow=5;
        if(n<5){
            return 0;
        }if(n==5){
            return 1;
        }
        while(n>=pow){
            cnt+=(n/pow);
            pow*=5;
        }return cnt;
    }
}