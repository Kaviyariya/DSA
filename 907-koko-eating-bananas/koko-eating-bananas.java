class Solution {
    static boolean koko(int arr[],int k,int h){
        long total=0;
        for(int n:arr){
            if(n%k==0){
                total+=n/k;
            }else{
                total+=n/k+1;
            }
        }
        System.out.println(k);
        System.out.println(total);
        System.out.println(" ");
        return (total<=h);
    }
    public int minEatingSpeed(int[] piles, int h) {
        int si=1,li=0;
        for(int i=0;i<piles.length;i++){
            li=Math.max(li,piles[i]);
        }
        int ans=0;
        while(si<=li){
            int mid=(si+li)/2;
            if(koko(piles,mid,h)){
                ans=mid;
                li=mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }
}