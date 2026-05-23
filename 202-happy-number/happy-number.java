class Solution {
    static int dig(int n){
        int squ=0;
        while(n!=0){
            int a=n%10;
            squ+=a*a;
            n=n/10;
        }
        return squ;
    }
    public boolean isHappy(int n) {
        while(n>9){
            n=dig(n);
        }
        return (n==1 || n==7);
    }
}