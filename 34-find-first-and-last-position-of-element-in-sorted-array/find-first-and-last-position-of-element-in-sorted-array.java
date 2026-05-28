class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int si=0,li=nums.length-1;
        while(si<=li){
            int mid =(si+li)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                li=mid-1;
            }else if(nums[mid]<target){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        si=0;
        li=nums.length-1;
        while(si<=li){
            int mid =(si+li)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                si=mid+1;
            }else if(nums[mid]<target){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        return ans;
    }
}