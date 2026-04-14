class Solution {
    public int reverse(int n) {
        long count=0;
        while(n!=0){
            count=count*10+n%10;
            n=n/10;
        }
        if(Integer.MIN_VALUE>count||Integer.MAX_VALUE<count){
            return 0;
        }
        return (int)count;
    }
}