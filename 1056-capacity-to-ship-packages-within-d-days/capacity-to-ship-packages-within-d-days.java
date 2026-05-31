class Solution {
    static boolean day(int arr[],int mid,int d){
        int sum=0,total=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                total++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return (total<=d);
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
            if(day(w,mid,days)){
                ans=mid;
                li=mid-1;
            }else{
                si=mid+1;
            }
        }
        return ans;
    }
}