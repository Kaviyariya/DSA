class Solution {
    static boolean div(int arr[],int mid,int t){
        int total=0;
        for(int i:arr){
            if(i%mid==0){
                total+=i/mid;
            }else{
                total+=i/mid+1;
            }
        }
        return (total<=t);
    }
    public int smallestDivisor(int[] nums, int t) {
        int si=1,li=0;
        for(int i:nums){
            si=Math.min(si,i);
            li=Math.max(li,i);
        }
        int ans=-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(div(nums,mid,t)){
                ans=mid;
                li=mid-1;
            }else{
                si=mid+1;
            }

        }
        return ans;
    }
}