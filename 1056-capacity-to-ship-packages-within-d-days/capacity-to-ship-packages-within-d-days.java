class Solution {
    static boolean capacity(int arr[],int mid,int d){
        int sum=0,day=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                sum=arr[i];
                day++;
            }else{
                sum+=arr[i];
            }
        }
        return (day<=d);
    }
    public int shipWithinDays(int[] w, int days) {
        int si=0,li=0;
        for(int i:w){
            si=Math.max(si,i);
            li+=i;
        }
        int ans=-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(capacity(w,mid,days)){
                ans=mid;
                li=mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }
}